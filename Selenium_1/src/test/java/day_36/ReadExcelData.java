package day_36;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

    public static void main(String[] args) throws Exception {

    	FileInputStream fis =
    			new FileInputStream("C:\\Users\\naren\\OneDrive\\TestData.xlsx");

        Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheetAt(0);


        for (int i = 1; i <= sheet.getLastRowNum(); i++) {

            Row row = sheet.getRow(i);

            String username = row.getCell(0).getStringCellValue();
            String password = row.getCell(1).getStringCellValue();

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
        }

        workbook.close();
        fis.close();
    }
}
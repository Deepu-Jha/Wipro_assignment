package utilities;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.*;

public class ExcelUtils {

    public static void readExcel() throws Exception {

        FileInputStream fis =
                new FileInputStream("testdata.xlsx");

        Workbook wb = WorkbookFactory.create(fis);

        Sheet sheet = wb.getSheetAt(0);

        Row row = sheet.getRow(1);

        String username = row.getCell(0).getStringCellValue();

        String password = row.getCell(1).getStringCellValue();

        System.out.println(username);

        System.out.println(password);

        wb.close();
    }
}
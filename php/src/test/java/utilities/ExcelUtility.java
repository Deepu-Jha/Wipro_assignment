package utilities;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.*;

public class ExcelUtility {

public static String getData(
String path,
String sheet,
int row,
int cell)
throws Exception {

FileInputStream fis =
new FileInputStream(path);

XSSFWorkbook wb =
new XSSFWorkbook(fis);

XSSFSheet sh =
wb.getSheet(sheet);

String value =
sh.getRow(row)
.getCell(cell)
.getStringCellValue();

wb.close();

return value;
}
}
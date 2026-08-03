package ExcelUtils;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

    public static Object[][] getExcelData() {

        Object[][] data = null;

        try {

            FileInputStream fis = new FileInputStream("TestData/LoginData.xlsx");

            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            XSSFSheet sheet = workbook.getSheetAt(0);

            int rows = sheet.getLastRowNum();
            int cols = sheet.getRow(0).getLastCellNum();

            data = new Object[rows][cols];

            for (int i = 1; i <= rows; i++) {

                for (int j = 0; j < cols; j++) {

                    data[i - 1][j] = sheet.getRow(i).getCell(j).toString();

                }
            }

            workbook.close();
            fis.close();

        } catch (Exception e) {

            e.printStackTrace();
        }

        return data;
    }
}
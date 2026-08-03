package DataProvider;

import org.testng.annotations.DataProvider;

import ExcelUtils.ExcelReader;

public class LoginData {

    @DataProvider(name = "loginData")
    public Object[][] getData() {

        return ExcelReader.getExcelData();

    }
}
package DataDriven_Testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		FileInputStream file = new FileInputStream("C:\\Users\\shend\\eclipse-workspace\\BASIC-Selenium\\src\\test\\resources\\Book1.xlsx");
	
		//open the workbook in read mode
		Workbook wb = WorkbookFactory.create(file);
		
		//capture the sheet 
		Sheet sh = wb.getSheet("Sheet1");
		
		//capture the data
		String value = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println(value);

	}

}
  
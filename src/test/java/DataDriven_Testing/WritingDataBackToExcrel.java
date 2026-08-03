package DataDriven_Testing;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataBackToExcrel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
		
		FileInputStream file = new FileInputStream("C:\\Users\\shend\\eclipse-"
				+ "workspace\\BASIC-Selenium\\src\\test\\resources\\Excel.xlsx");
	
		//open the workbook in read mode
		Workbook wb = WorkbookFactory.create(file);
		
		//capture the sheet 
		Sheet sh = wb.getSheet("Sheet1");
		
		//create the cell and add the data into it 
		sh.getRow(1).createCell(0).setCellValue("Data");
		
		FileOutputStream fileOutputStream = new FileOutputStream("C:\\Users\\shend\\"
				+ "eclipse-workspace\\BASIC-Selenium\\src\\test\\resources\\Excel.xlsx");
		
		//store the data 
		wb.write(fileOutputStream);
		
		//save
		wb.close();

	}

}

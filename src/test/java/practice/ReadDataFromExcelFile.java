package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//step:1 Openthe doc in Java Readable Format
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
         
		
		//Step:2 create workbook
		Workbook Wb = WorkbookFactory.create(fis);
		
		//step:3 Navigate To required Sheet 
		Sheet sh = Wb.getSheet("Contacts");
		
		//Step 4 : Navigate to requires  row 
		Row rw = sh.getRow(1);
		//Step 5 :Navigate to required cell
		Cell cl = rw.getCell(2);
		//step 6: Capture the value and print 
		String value = cl.getStringCellValue();
		System.out.println(value);
		
		}

}

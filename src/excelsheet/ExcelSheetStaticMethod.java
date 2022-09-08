package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetStaticMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile = new FileInputStream("C:\\webdriver\\exsheets.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("sheet4");
		
		for(int i=0; i<5; i++)
		{
			String values = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(values);
		
		}
		System.out.println("=====================================");
		for(int i=0; i<3; i++)
		{
			String values = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(values);
		
		}
		System.out.println("=====================================");
		int lastrownum = mysheet.getLastRowNum();
	    for(int i=0; i<=lastrownum; i++)
		{
			String values = mysheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(values);
		
		}
	    System.out.println("=====================================");
	    int lastcolumnnum = mysheet.getRow(0).getLastCellNum()-1;
		for(int i=0; i<=lastcolumnnum; i++)
		{
			String values = mysheet.getRow(0).getCell(i).getStringCellValue();
			System.out.println(values);
		
		}
	}

}

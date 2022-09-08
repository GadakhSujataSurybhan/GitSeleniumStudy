package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile = new FileInputStream("C:\\webdriver\\exsheets.xlsx");
		Workbook test = WorkbookFactory.create(MyFile);
		Sheet sheetname = test.getSheet("sheet2");
		Row myrow = sheetname.getRow(0);
		Cell mycell = myrow.getCell(0);
		String myvalue = mycell.getStringCellValue();
		System.out.println("the value of first row and first column is "+myvalue);
		double value1 = sheetname.getRow(0).getCell(1).getNumericCellValue();
		System.out.println("the value of first row and second column is "+value1);
		String value2 = sheetname.getRow(1).getCell(0).getStringCellValue();
		System.out.println("the value of second row and first column is "+value2);


	}

}

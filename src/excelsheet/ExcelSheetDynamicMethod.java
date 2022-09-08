package excelsheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheetDynamicMethod {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile = new FileInputStream("C:\\webdriver\\exsheets.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("sheet4");
		
		int lastrownum = mysheet.getLastRowNum();
		int lastcolumnNum = mysheet.getRow(0).getLastCellNum()-1;
		
		for(int i=0; i<=lastrownum; i++)
		{
			for(int j=0; j<=lastcolumnNum; j++)
			{
				String values = mysheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(values+"  ");
			}
			System.out.println();
		
		}
		

	}

}

package excelsheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MultiCellTypeDeta {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream MyFile = new FileInputStream("C:\\webdriver\\exsheets.xlsx");
		Sheet mysheet = WorkbookFactory.create(MyFile).getSheet("sheet1");
		
		int lastnumrows = mysheet.getLastRowNum();
      int lastnumcell = mysheet.getRow(0).getLastCellNum()-1;
      
      for(int i=0; i<=lastnumrows; i++)
      {
    	  for(int j=0; j<=lastnumcell; j++)
    	  {
    		  Cell info = mysheet.getRow(i).getCell(j);
    		  CellType types = info.getCellType();//string, numeric,boolean
    		  
    		  if(types==CellType.STRING)
    		  {
    			  String value = info.getStringCellValue();
    			  System.out.print(value+ " ");
    		  }
    		  
    		  else if(types==CellType.BOOLEAN)
    		  {
    			  boolean value = info.getBooleanCellValue();
    			  System.out.print(value+ " ");
    		  }
    		  else if(types==CellType.NUMERIC)
    		  {
    			  double value = info.getNumericCellValue();
    			  System.out.print(value+ " ");
    		  }
    		  
    		 
    	  }
    	  
    	 System.out.println();
    	  
      }
		

	}

}

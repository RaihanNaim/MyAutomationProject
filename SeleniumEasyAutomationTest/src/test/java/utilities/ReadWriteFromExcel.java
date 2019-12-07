package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWriteFromExcel {
	
	
	
	
	
	public String readExcel(String workbook,int sheetNum,int row,int col) throws IOException {
		        InputStream file = new FileInputStream("src/test/resources/testdata/"+workbook);
		        XSSFWorkbook  wb = new XSSFWorkbook(file);    
		       XSSFCell value= wb.getSheetAt(sheetNum).getRow(row).getCell(col); 
		       System.out.println("File You reading: "+workbook+" and cell value is: "+value);
			return workbook;
		
		
		
	}
	
	
	
	
	
	
	public void writeToExcel() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

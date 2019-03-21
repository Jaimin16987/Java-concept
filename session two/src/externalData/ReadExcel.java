package externalData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws Exception{
		File src = new File("C:\\Users\\patel\\Documents\\excelData.xlsx");
		FileInputStream fi = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet S1 = wb.getSheetAt(0);
	
	  int RowNo = S1.getLastRowNum();
	  System.out.println("number of row is "+RowNo);
	  
	  for(int i = 0; i<=RowNo; i++){
		  
		 String data0 = S1.getRow(i).getCell(0).getStringCellValue();
		  System.out.println("data from row "+i+" is " + data0);
		  
		  
	  }
		
	
		
		/* String Data1 =  S1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(Data1);
		
		String Data2 =  S1.getRow(0).getCell(1).getStringCellValue();
		System.out.println(Data2);*/
	wb.close();
	//2. method with workbookFactory.
		
		/*Workbook wb = WorkbookFactory.create(fi);
	  Sheet studentAtnd = wb.getSheetAt(0);
	  Row row0 = studentAtnd.getRow(0);
	  
	  Cell A = row0.getCell(0);
	 
	  System.out.println(A);
	  
	  fi.close();*/
	}

}

package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	XSSFSheet S1;
   public  ExcelDataConfig(String excelPath){
	   
	   try {
		File src = new File(excelPath);
			FileInputStream fi = new FileInputStream(src);
			 wb = new XSSFWorkbook(fi);
			 S1 = wb.getSheet("StudentAttendance");
	
	} catch (Exception e) {
		
		System.out.println(e.getMessage());
	}
	}
    

  public String getData(String Sheetname,int row, int column) {
	 S1 = wb.getSheet(Sheetname);
	  String data =S1.getRow(row).getCell(column).getStringCellValue();
	  return data;
	  }
     }
  

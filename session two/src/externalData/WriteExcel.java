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

public class WriteExcel {

	public static void main(String[] args) throws Exception{
		File src = new File("C:\\Users\\patel\\Documents\\excelData.xlsx");
		
// this following code for read data from excel file.
		FileInputStream fi = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet S1 = wb.getSheetAt(0);
	
	S1.getRow(0).createCell(2).setCellValue(80.85);
	S1.getRow(1).createCell(2).setCellValue(90.85);
	S1.getRow(2).createCell(2).setCellValue(95.85);
	
     
	
	
// this following code for write data in excel file.
	FileOutputStream fo = new FileOutputStream(src);
	wb.write(fo);
	wb.close();
	
	
	
	
	
	}
		}

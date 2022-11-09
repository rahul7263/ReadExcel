package WriteExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
   
	public void writeExcel(String sheetName, String cellvalue, int row,int col) throws IOException {
		
		String excelPath = "C:\\Users\\Rahul\\eclipse-workspace\\ReadExcel\\TestExcel\\TestExcel.xlsx";
		File file = new File(excelPath);
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet(sheetName);
		
		sheet.getRow(row).createCell(col).setCellValue(cellvalue);
		
		FileOutputStream fos = new FileOutputStream(new File(excelPath));
		
		wb.write(fos);
		
		wb.close();
		fos.close();
	}
}

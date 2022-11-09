package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLibrary {
    
	XSSFWorkbook wb;
	XSSFSheet sheet;
	
	public ExcelLibrary() throws IOException {
		
		String excelpath = "C:\\Users\\Rahul\\eclipse-workspace\\ReadExcel\\TestExcel\\TestExcel.xlsx";
		
		File file = new File(excelpath);
		FileInputStream fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
	}
   
	public String readData(String sheetName, int row , int col) {
		
		sheet = wb.getSheet(sheetName);
		String data=sheet.getRow(row).getCell(col).getStringCellValue();
		return data;
	}
}

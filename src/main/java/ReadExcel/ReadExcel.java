/**
 * 
 */
package ReadExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

/**
 * @author Rahul
 *
 */
public class ReadExcel {
	
	@Test
	public void readexcel() throws IOException {
		
		String excelpath = "C:\\Users\\Rahul\\eclipse-workspace\\ReadExcel\\TestExcel\\TestExcel.xlsx";
		String fileNameString = "TestExcel";
		String sheetName = "TestExcelSheet";
		
		//create obejct of file path
		File file = new File(excelpath);
		
		//to read the file
		
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet(sheetName);
		
		int RowCount = sheet.getLastRowNum();
		System.out.println("Total Row"+RowCount);
		
		String data = sheet.getRow(0).getCell(1).getStringCellValue();
		System.out.println(data);
		
		for(int i=0; i<=RowCount; i++) {
			
			Row row = sheet.getRow(i);
			
			for(int j =0; j<row.getLastCellNum(); j++) {
				
				String data1 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.print(data1+" ");
			}
			System.out.println();
			wb.close();
		}
	}

}

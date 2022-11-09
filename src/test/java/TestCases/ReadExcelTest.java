package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import ReadExcel.ExcelLibrary;

public class ReadExcelTest {
     
	@Test
	public void readExcelTest() throws IOException {
		
		ExcelLibrary obj = new ExcelLibrary();
		
		String datString = obj.readData("TestExcelSheet", 5, 1);
		System.out.println("The Data is "+datString);
	}
}

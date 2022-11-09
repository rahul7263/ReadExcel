package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import WriteExcel.WriteExcel;

public class WriteExcelTest {
  
	WriteExcel obj = new WriteExcel();
	
	@Test
	public void writeExcelTest() throws IOException {
		
		obj.writeExcel("TestExcelSheet", "female", 1, 2);
	}
	
	@Test
	public void writeExcelTest1() throws IOException {
		
		obj.writeExcel("TestExcelSheet", "male", 0, 2);
	}
}

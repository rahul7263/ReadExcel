package TestCases;

import org.testng.annotations.Test;

import com.utility.NewExcelLibrary;

public class ExcelTest {
    
	NewExcelLibrary obj = new NewExcelLibrary("C:\\Users\\Rahul\\eclipse-workspace\\ReadExcel\\TestExcel\\TestExcel.xlsx");
	
	@Test(priority=1)
	public void testCase1() {
		
		int totalRows = obj.getRowCount("Employee");
		System.out.println(totalRows);
	}
	
	@Test(priority=3)
	public void testCase2() {
		
		String  salary = obj.getCellData("Employee","Salary",4);
		System.out.println("Salary is: "+salary);
	}
	
	@Test(priority=3)
	public void testCase3() {
		
		String  rating = obj.getCellData("Employee",4,2);
		System.out.println("Salary is: "+rating);
	}
	
	@Test(priority=4)
	public void testCase4() {
		
		obj.setCellData("Employee", "ID", 2, "105");
		
	}
	
	@Test(priority=5)
	public void testCase5() {
		
		boolean flag = obj.addSheet("Employee2");
		System.out.println(flag);
		
		
	}
	
	@Test(priority=6)
	public void testCase6() {
		
		boolean flag = obj.removeSheet("Employee2");
		System.out.println(flag);
		
		
	}
}

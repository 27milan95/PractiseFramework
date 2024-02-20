package data;

import utilities.Xls_Reader;

public class DataFiles {
	
	Xls_Reader d = new Xls_Reader("C:\\testing\\GmailTest.xlsx");
	
	public String blankErr = d.getCellData("Sheet1", 3, 5);
	public String wrongErr = d.getCellData("Sheet1", 3, 2);
	public String invalidErr = d.getCellData("Sheet1", 3, 4);
	public String wrongEmail = d.getCellData("Sheet1", 1, 2);
	public String specialCharEmail = d.getCellData("Sheet1", 1, 4);
	

	

}

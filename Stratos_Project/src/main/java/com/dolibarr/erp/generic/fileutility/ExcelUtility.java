package com.dolibarr.erp.generic.fileutility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
public String getDataFromExcel(String Sheetname, int row, int celNum) throws Throwable {
	FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Testdata.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String data=wb.getSheet(Sheetname).getRow(row).getCell(celNum).getStringCellValue();
	return data;
	
	
}

 public int getRowCount(String Sheetname) throws Throwable {
	 FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		int rowcount=wb.getSheet(Sheetname).getLastRowNum();
		return rowcount;
 }
  public void setDataToExcel(String Sheetname, int row, int celNum) throws Throwable {
	  FileInputStream fis=new FileInputStream("./src/test/resources/TestData/Testdata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		wb.getSheet(Sheetname).getRow(row).createCell(celNum);
		FileOutputStream fos= new FileOutputStream("./src/test/resources/TestData/Testdata.xlsx");
		wb.write(fos);
		wb.close();
  }
}

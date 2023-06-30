package imp_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class orangehrmlive_Dataprovider_excel_DataClass {
	@DataProvider(name="loginData")
	public String[][] getData() throws Exception {
		File excelFile = new File("D:\\New folder\\Automation_23\\src\\imp_Practice\\orange.xlsx");
		System.out.println(excelFile.exists());
		FileInputStream fis = new FileInputStream(excelFile);
		Sheet sheet=WorkbookFactory.create(fis).getSheet("Sheet1");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(noOfRows);
		int noOfColumns = sheet.getRow(0).getLastCellNum();
	
		String[][] data = new String[noOfRows-1][noOfColumns];
		for (int i = 0; i <noOfRows-1; i++) {
			for (int j = 0; j <noOfColumns; j++) {
				DataFormatter df = new DataFormatter();
				data[i][j] =  df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
		}
		
		fis.close();
		
 		for (String[] dataArr : data) {
 			System.out.println(Arrays.toString(dataArr));
 		}
		return data;
	}

}

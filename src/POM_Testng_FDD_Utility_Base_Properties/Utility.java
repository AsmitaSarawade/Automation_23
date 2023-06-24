package POM_Testng_FDD_Utility_Base_Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static String getTestData(int rowindex,int columnindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("D:\\New folder\\Automation_23\\src\\PolicyBazar.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		String value=sh.getRow(rowindex).getCell(columnindex).getStringCellValue();
		return value;
	}
	public static void takescreenshot(WebDriver driver, int TCID) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\New folder\\Automation_23\\src\\POM_TestNG_FDD\\TestCaseID"+TCID+".jpg");
		FileHandler.copy(src, dest);
	}
	public static String getData(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("D:\\New folder\\Automation_23\\src\\POM_Testng_FDD_Utility_Base_Properties\\TestData.properties");
		Properties p=new Properties();
		p.load(file);
		String value=p.getProperty(key);
		return value;
	}
	

}

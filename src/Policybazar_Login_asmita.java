import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Policybazar_Login_asmita {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		Thread.sleep(2000);
		FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\policybazaar.xlsx");
		String mno=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@id='central-login-module-sign-mobile'])[2]")).sendKeys(mno);
		//Thread.sleep(2000);
		//driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		//String pass=WorkbookFactory.create(file).getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sanjay@23");
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		//Thread.sleep(2000);
		WebElement myAcc = driver.findElement(By.xpath("//div[text()='My Account']"));
		Actions act=new Actions(driver);
		act.moveToElement(myAcc).perform();
		//Thread.sleep(2000);
		
		//click on my profile btn
		driver.findElement(By.xpath("//span[text()='My profile']")).click();
		Thread.sleep(2000);
		Set <String> allid=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allid);
		String childb=al.get(1);
		driver.switchTo().window(childb);
		String actvalue=driver.findElement(By.xpath("//input[@name='personName']")).getAttribute("value");
		System.out.println(actvalue);
		String expvalue=WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).getStringCellValue();
		if(actvalue.equals(expvalue))
		{
			System.out.println("Test case is pass");
		}
		else
		{
			System.out.println("Test case is fail ");
		}
		//driver.close();
		
	}

}

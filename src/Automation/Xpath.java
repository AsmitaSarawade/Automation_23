package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
    Thread.sleep(2000);
    WebElement fn=driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-'][1]"));
    fn.sendKeys("Asmita");
     Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("asmita");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8390274793");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Asmita#23");
    Thread.sleep(1000);
    Select sc=new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
    sc.selectByVisibleText("18");
    Thread.sleep(1000);
    Select sc1=new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
    sc1.selectByVisibleText("Mar");
    Thread.sleep(1000);
    Select sc2=new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));
    sc2.selectByVisibleText("1994");
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@value='1']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@name='websubmit']")).click();;
    
    
 
  
	}

}

package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_byattribute {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		//d.get("https://www.facebook.com");
		//d.findElement(By.xpath("//input[@id='email']")).sendKeys("xyt");
		//d.close(); 
		d.get("https://accounts.google.com/signin/v2/challenge/pwd?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AQMjQ7RkikxcfZOdfB_p4zJpDiwTlXXk5GXeTNzzLwOVM-cU-uM6cpKE_eUU9XsPiClA84AZWRA3&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=ADBc5UObIot4CZDK5GQvGOCkO_4r3dFCnZzYi9d_DcGcO0a0rN5m_-Ya9VZ_WBhC");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("asmi.sarawade0");
	}

}

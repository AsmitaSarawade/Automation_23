package Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class single_select {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Selenium%20jar/multi_select.html");
		d.manage().window().maximize();
		WebElement sm=d.findElement(By.xpath("//select [@id='1234']"));
		Select s=new Select(sm);
		s.selectByIndex(0);
		String text=s.getFirstSelectedOption().getText();
		System.out.println(text);
		if(text.equals("Ind"))
		{
			System.out.println("First selcet option is "+s.getFirstSelectedOption().getText());
		}
		else
		{
			System.out.println("First option is not selected");
		}

	}

}

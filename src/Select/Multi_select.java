package Select;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_select {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("file:///D:/Selenium%20jar/multi_select.html");
		d.manage().window().maximize();
		WebElement sm=d.findElement(By.xpath("//select [@id='1234']"));
		Select s=new Select(sm);
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(3);
		Thread.sleep(1000);
		s.deselectByIndex(3);
		System.out.println("Dropdown is mutiselecteable :"+s.isMultiple());
		//int size=s.getAllSelectedOptions().size();
		//System.out.println(size);
		List<WebElement> l=s.getAllSelectedOptions();
		int size1=l.size();
		System.out.println(size1);
		for(WebElement w:l)
		{
			System.out.println(w.getText());
		}
	}

}

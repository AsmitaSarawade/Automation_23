package Select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.get("	https://bhulekh.mahabhumi.gov.in/");
		d.manage().window().maximize();
		Select s=new Select(d.findElement(By.xpath("//select[@id='list']")));
		Thread.sleep(2000);
		s.selectByValue("Pune/Pune.html");
		ArrayList<String> ar=new ArrayList<String>();
		List<WebElement> list=s.getOptions();
		for(WebElement w:list)
		{
			String s1=w.getText();
			System.out.println(s1);
			ar.add(s1);
		}
		Collections.sort(ar);
		System.out.println("Elements in Ascending order");
		System.out.println(ar);
		
		
	}

}

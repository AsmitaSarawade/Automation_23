package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Automation_basics {

	public static void main(String[] args) {
		WebDriver d=new  ChromeDriver();
		//new EdgeDriver();
		d.get("https://www.facebook.com");
		String name=d.getCurrentUrl();
		//d.close();
		System.out.println(name);


	}

}

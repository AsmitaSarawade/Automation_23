package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://stock.amolujagare.com/");

        //Login login = new Login(driver);

        //login.setTxtUsername("admin");
        //login.setTxtPassword("admin");
       // login.clickBtnLogin();

	}

}

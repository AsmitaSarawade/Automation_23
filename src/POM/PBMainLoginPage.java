package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBMainLoginPage {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//PBLoginPage Object Creation

		PBLoginPage login=new PBLoginPage(driver);
		login.clickOnSignInBtn();
		
		PBMnoPage mno=new PBMnoPage(driver);
		mno.Entermno();
		mno.ClickonSingin();
		
		PBPasswordPage pass=new PBPasswordPage(driver);
		pass.Enterpass();
		pass.Singin();
		
		PBMyAccountPage acc=new PBMyAccountPage(driver);
		acc.ClickonMyAcc();
		
		PBMyProfilePage pp=new PBMyProfilePage(driver);
		pp.Clickonprofile();
		
		PBProfileHomePage PH=new PBProfileHomePage(driver);
		PH.switchToSwitchChildWindow();
		PH.verifyFullName();
	}

}

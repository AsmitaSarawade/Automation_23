package POM_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Pom extends POM_TestNG_Base {
	
	PBLoginPage login;
	PBMnoPage mno;
	PBPasswordPage pass;
	PBMyAccountPage acc;
	PBMyProfilePage pp;
	PBProfileHomePage PH;
	
	@BeforeClass
	public void OpenBrowser()
	{
		OpenBrowser();
		login=new PBLoginPage(driver);
		mno=new PBMnoPage(driver);
        pass=new PBPasswordPage(driver);
		acc=new PBMyAccountPage(driver);
		pp=new PBMyProfilePage(driver);
		PH=new PBProfileHomePage(driver);
		}
	@BeforeMethod
	public void Logintoapp()
	{
		login.clickOnSignInBtn();
		mno.Entermno();
		mno.ClickonSingin();
		pass.Enterpass();
		pass.Singin();
		
	}
	@Test
	public void verifyfullName()
	{
		acc.ClickonMyAcc();
		pp.Clickonprofile();
		PH.switchToSwitchChildWindow();
		PH.getFullName();
		String expName="Jan batch";
		String actName = PH.getFullName();
		Assert.assertEquals(actName, expName);
	}
	@AfterMethod
    public void Logoutapp()
    {
		
    }
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}

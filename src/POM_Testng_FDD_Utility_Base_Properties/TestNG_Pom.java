package POM_Testng_FDD_Utility_Base_Properties;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
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
	int TCID;
	
	@BeforeClass
	public void OpenBrowser() throws IOException
	{
	    StartBrowser();
		login=new PBLoginPage(driver);
		mno=new PBMnoPage(driver);
        pass=new PBPasswordPage(driver);
		acc=new PBMyAccountPage(driver);
		pp=new PBMyProfilePage(driver);
		PH=new PBProfileHomePage(driver);
		}
	@BeforeMethod
	public void Logintoapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.clickOnSignInBtn();
		Thread.sleep(3000);
		mno.Entermno(Utility.getData("mno"));
		Thread.sleep(1000);
		mno.ClickonSingin();
		Thread.sleep(3000);
		pass.Enterpass(Utility.getData("pass"));
		pass.Singin();
		
	}
	@Test
	public void verifyfullName() throws EncryptedDocumentException, IOException, InterruptedException
	{
		TCID=101;
		acc.ClickonMyAcc();
		pp.Clickonprofile();
		PH.switchToSwitchChildWindow();
		PH.getFullName();
		Thread.sleep(3000);
		String expName=Utility.getTestData(2,0);
		String actName = PH.getFullName();
		Assert.assertEquals(actName, expName);
	}
	@AfterMethod
    public void Logoutapp(ITestResult t1) throws IOException
    {
		if(t1.getStatus()==ITestResult.FAILURE)
		{
			Utility.takescreenshot(driver, TCID);
		}
    }
	@AfterClass
	public void CloseBrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}

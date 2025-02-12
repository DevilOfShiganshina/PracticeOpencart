package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_accountRegistration extends BaseClass {
	WebDriver driver = new ChromeDriver();
	@Test
	public void verifyAccountRegistration() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickMyAccountBtn();
		hp.clickRegisterLink();
		
		//RegistrationPage rp = new RegistrationPage(driver);
		
	}
	
	@AfterClass
	public void teardown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}

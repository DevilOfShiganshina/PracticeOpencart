package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class LogoutPage extends BasePage {
	WebDriver driver;
	public LogoutPage(WebDriver driver) { super(driver); }
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement logoutMsg;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
	WebElement contBtn;
	
	public boolean verifyLogout() {
		return logoutMsg.getText().equalsIgnoreCase("Account Logout");
	}
	
	public void clickContBtn() { this.contBtn.click(); }
}

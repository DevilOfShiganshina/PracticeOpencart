package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	WebDriver driver;
	public LoginPage(WebDriver driver) { super(driver); }
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myAccBtn;
	
	public void clickMyAccBtn() { this.myAccBtn.click(); }
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement loginOption;
	
	public void clickLoginBtn() { this.loginOption.click(); }
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/a")
	WebElement newAccountBtn;
	
	public void clickNewAcc() { this.newAccountBtn.click(); }
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/div/a")
	WebElement emailField;
	
	public void fillEmail() { emailField.sendKeys("abcdefgh@gmail.com"); }
	
	@FindBy(xpath = "//*[@id=\"input-password\"]")
	WebElement passwordField;
	
	public void fillPassword() { passwordField.sendKeys("abcdefgh"); }
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div[2]/div/form/input")
	WebElement loginBtn;
	
	public void clickLogin() { this.loginBtn.click(); }
}

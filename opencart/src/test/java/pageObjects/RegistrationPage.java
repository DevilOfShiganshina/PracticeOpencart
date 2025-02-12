package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {
	WebDriver driver;
	public RegistrationPage(WebDriver driver) { super(driver); }
	
	// locators	
	@FindBy(xpath = "//*[@id=\"input-firstname\"]")
	WebElement firstName;
	
	@FindBy(xpath = "//*[@id=\"input-lastname\"]")
	WebElement lastName;
	
	@FindBy(xpath = "//*[@id=\"input-email\"]")
	WebElement email;
	
	@FindBy(xpath = "//*[@id=\"input-telephone\"]")
	WebElement phoneNumber;
	
	@FindBy(xpath = "//*[@id=\"input-password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"input-confirm\"]")
	WebElement confirmPass;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input")
	WebElement newsletterConfirm;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
	WebElement privacyPolicy;
	
	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[2]")
	WebElement continueBtn;
	
	public void enterFirstName(String fname) {
		this.firstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		this.lastName.sendKeys(lname);
	}
	
	public void enterEmail(String email) {
		this.email.sendKeys(email);
	}
	
	public void enterPhoneNumber(String phone) {
		this.confirmPass.sendKeys(phone);
	}
	
	public void enterPassword(String pass) {
		this.password.sendKeys(pass);
	}
	
	public void confirmPassword(String pass) {
		this.confirmPass.sendKeys(pass);
	}
	
	public void newsletter() {
		this.newsletterConfirm.click();
	}
	
	public void privacyConfirm() {
		this.privacyPolicy.click();
	}
	
	public void btnContinue() {
		this.continueBtn.click();
	}
}

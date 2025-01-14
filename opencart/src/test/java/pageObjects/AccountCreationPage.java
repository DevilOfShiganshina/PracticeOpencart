package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreationPage extends BasePage {
	WebDriver driver;
	public AccountCreationPage(WebDriver driver) { super(driver); }
	
	@FindBy(xpath = "//*[@id=\"content\"]/h1")
	WebElement accCreationMsg;
	
	@FindBy(xpath = "//*[@id=\"content\"]/div/div/a")
	WebElement contBtn;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement myAccBtn;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement myAccOption;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")
	WebElement orderHistoryOption;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[3]/a")
	WebElement transactionHistoryOption;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[4]/a")
	WebElement downloadOption;
	
	@FindBy(xpath = "//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	WebElement logoutOption;
	
	public boolean verifyAccountCreation() {
		try {
			return accCreationMsg.getText().equalsIgnoreCase("Your Account Has Been Created!");
		} catch (Exception e) {
			return false;
		}
	}
	
	public void clickContinueBtn() { this.contBtn.click(); }
	
	public void clickMyAccBtn() { this.myAccBtn.click(); }
	
	public void clickMyAccOption() {this.myAccOption.click(); }
	
	public void clickOrderHistoryOption() { this.orderHistoryOption.click(); }
	
	public void clickTransactionHistoryOption() { this.transactionHistoryOption.click(); }
	
	public void clickDownloadOption() { this.downloadOption.click(); }
	
	public void clickLogout() { this.logoutOption.click(); }
}

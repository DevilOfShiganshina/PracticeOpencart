package testBase;

import java.time.Duration;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	WebDriver driver;
	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("http://localhost/opencart/upload/");
		driver.manage().window().maximize();
	}
	
	public String generateRandomNumeric(int i) {
		return RandomStringUtils.randomNumeric(i);
	}
	
	public String generateRandomAlphaNumeric(int i) {
		return RandomStringUtils.randomAlphanumeric(i);
	}
}

package activity7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class activity7 {
	ChromeDriver driver;
	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {
		
		driver = new ChromeDriver();
		
		driver.get("https://v1.training-support.net/selenium/login-form");
	}

	@DataProvider(name = "Authentication")
	public static Object[][] credentials() {
		return new Object[][] { { "admin", "password" } };
	}

	@Test(dataProvider = "Authentication")
	public void loginTestCase(String username, String password) {
		
		WebElement usernameField = driver.findElement(By.id("username"));
		WebElement passwordField = driver.findElement(By.id("password"));


		usernameField.sendKeys(username);
		passwordField.sendKeys(password);

	
		driver.findElement(By.cssSelector("button[type='submit']")).click();


		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
		Assert.assertEquals(loginMessage, "Welcome Back, admin");
	}

	@AfterClass
	public void afterClass() {
		
		driver.close();
	}

}

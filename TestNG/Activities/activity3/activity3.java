package activity3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class activity3 {
	ChromeDriver driver;

	@Test
	public void method1() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("password");
		driver.findElement(By.xpath("//button[@class='ui button']")).click();

		String text = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		String org_text = "Welcome Back, admin";
		Assert.assertEquals(org_text, text);

	}

	@BeforeClass
	public void browser() {
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/login-form");
	}

	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}

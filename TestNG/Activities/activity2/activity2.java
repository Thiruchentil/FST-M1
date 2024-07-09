package activity2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class activity2 {
	ChromeDriver driver;

	@Test(priority = 1)
	public void method1() {
		String title = driver.getTitle();
		String org_title = "Target Practice";
		System.out.println(title);
		Assert.assertEquals(org_title, title);

	}

	@Test(priority = 2)
	public void method2() {
		String color = driver.findElement(By.xpath("//button[contains(.,'Black')]")).getText();
		Assert.assertEquals(color, "Green");
	}

	@Test(priority = 3, enabled = false)
	public void method3() {
		System.out.println("This is 3rd @test");

	}

	@Test
	public void aSkipTest() throws SkipException {
		String condition = "Skip Test";

		if (condition.equals("Skip Test")) {
			throw new SkipException("Skipping - This is not ready for testing ");
		} else {
			System.out.println("This is a skipped method");
		}
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

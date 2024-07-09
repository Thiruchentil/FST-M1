package activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class activity1 {
	ChromeDriver driver;

	// public static void main(String[] args) {
	@Test
	public void method() {
		String title = driver.getTitle();
		String org_title = "Training Support";
		System.out.println(title);
		Assert.assertEquals(org_title, title);

		driver.findElement(By.linkText("About Us")).click();
		String newpage = driver.getTitle();
		System.out.println(newpage);
		String page = "About Training Support";
		Assert.assertEquals(page, newpage);
	}

	@BeforeClass
	public void browser() {
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/");
	}

	@AfterClass
	public void closebrowser() {
		driver.close();
	}
}

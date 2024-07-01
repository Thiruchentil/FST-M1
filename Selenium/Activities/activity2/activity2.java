package activity2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity2 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/login-form");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[contains(.,'Log in')]")).click();
		driver.quit();
	}
}

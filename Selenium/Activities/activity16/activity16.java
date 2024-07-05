package activity16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity16 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		System.out.println(driver.getTitle());
		WebElement username = driver
				.findElement(By.xpath("//input[contains(@class, '-username')]"));
		username.sendKeys("hello");
		WebElement password = driver
				.findElement(By.xpath("//input[contains(@class, '-password')]"));
		password.sendKeys("12345");
		WebElement cnfm_password = driver
				.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
		cnfm_password.sendKeys("12345");

		WebElement signup = driver.findElement(By.xpath("//button[contains(text(), 'Sign Up')]"));
		signup.click();
		String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
		System.out.println(loginMessage);
		
	}
}

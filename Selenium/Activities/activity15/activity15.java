package activity15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity15 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://v1.training-support.net/selenium/dynamic-attributes");

		System.out.println(driver.getTitle());

		WebElement username = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		username.sendKeys("admin");
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password'][1]"));
		password.sendKeys("password");

		WebElement login = driver.findElement(By.xpath("//button[@class='ui button' and contains(text(),'Log in')]"));
		login.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

		String login_msg = driver.findElement(By.xpath("//div[@id='action-confirmation']")).getText();
		System.out.println(login_msg);
		driver.quit();

	}

}

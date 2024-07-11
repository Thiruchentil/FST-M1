package activity20;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class activity20 {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://v1.training-support.net/selenium/javascript-alerts");

		System.out.println("Home page title: " + driver.getTitle());

		driver.findElement(By.id("prompt")).click();

		Alert promtAlert = driver.switchTo().alert();

		String alertText = promtAlert.getText();
		System.out.println("Text in alert: " + alertText);

		promtAlert.sendKeys("Awesome!");

		promtAlert.accept();

		driver.quit();
	}
}

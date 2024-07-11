package activity19;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity19 {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();


		driver.get("https://v1.training-support.net/selenium/javascript-alerts");

		System.out.println("Home page title: " + driver.getTitle());

		driver.findElement(By.id("confirm")).click();

		Alert confirmAlert = driver.switchTo().alert();

		String alertText = confirmAlert.getText();
		System.out.println("Text in alert: " + alertText);

		confirmAlert.accept();

		driver.quit();
	}

}

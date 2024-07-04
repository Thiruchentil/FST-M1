package activity12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity12 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://v1.training-support.net/selenium/dynamic-controls");

		System.out.println(driver.getTitle());
		WebElement input = driver.findElement(By.xpath("//div[@id='dynamicText']"));
		if (input.isSelected()) {
			System.out.println("input box is enabled");
		} else {
			System.out.println("input box is disabled");
		}

		driver.findElement(By.xpath("//button[@id='toggleInput']")).click();
		WebElement input1 = driver.findElement(By.xpath("//div[@id='dynamicText']"));
		if (input1.isEnabled()) {
			System.out.println("input box is enabled");
		} else {
			System.out.println("input box is disabled");
		}

	}
}

package activity1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity1 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://v1.training-support.net/");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("about-link")).click();
		System.out.println(driver.getTitle());
		driver.quit();

	}

}

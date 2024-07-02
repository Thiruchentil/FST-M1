package activity5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class activity5 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/input-events");
		System.out.println(driver.getTitle());
		Actions a = new Actions(driver);
		a.click().pause(2000).build().perform();
		String data = driver.findElement(By.xpath("//div[@class='active']")).getText();
		System.out.println(data);
		a.doubleClick().pause(2000).build().perform();
		String data1 = driver.findElement(By.xpath("//div[@class='active']")).getText();
		System.out.println(data1);
		a.contextClick().pause(2000).build().perform();
		String data2 = driver.findElement(By.xpath("//div[@class='active']")).getText();
		System.out.println(data2);
		driver.quit();

	}
}

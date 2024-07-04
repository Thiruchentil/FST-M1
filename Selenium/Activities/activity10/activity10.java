package activity10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity10 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://v1.training-support.net/selenium/dynamic-controls");

	System.out.println(driver.getTitle());
	
	WebElement checkbox=driver.findElement(By.xpath("//input[@class='willDisappear']"));
	if (checkbox.isDisplayed()) { 
	    System.out.println("Checkbox is displayed");
	}
	
	WebElement rmv_checkbox=driver.findElement(By.xpath("//*[@id=\"toggleCheckbox\"]"));
	rmv_checkbox.click();
	if (checkbox.isDisplayed()) { 
	    System.out.println("Checkbox is displayed");
	}else {
		System.out.println("Checkbox is not displayed");
	}
	driver.quit();
	
}
}

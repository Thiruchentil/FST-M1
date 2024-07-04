package activity11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity11 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://v1.training-support.net/selenium/dynamic-controls");

		System.out.println(driver.getTitle());
		WebElement input=driver.findElement(By.xpath("//*[@id=\"toggleInput\"]"));
		if (input.isSelected()) { 
		    System.out.println("input is selected");
		}else{
			System.out.println("input is not selected");
		}
				
		WebElement enbl_input=driver.findElement(By.xpath("//*[@id=\"toggleInput\"]"));
		enbl_input.click();
		Thread.sleep(2000);
		if (enbl_input.isSelected()) { 
		    System.out.println("input is selected");
		}else {
			System.out.println("Checkbox is not selected");
		}
		driver.quit();
		
		
		
	}

}

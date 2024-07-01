package activity4;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class activity4 {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://v1.training-support.net/selenium/target-practice");
	System.out.println(driver.getTitle());
	String third_header = driver.findElement(By.xpath("//h3[@id='third-header']")).getText();
	System.out.println(third_header);
	System.out.println(driver.findElement(By.xpath("//h4[contains(.,'Fourth header')]")).getCssValue("color"));
	String violetButtonClass = driver.findElement(By.xpath("//button[text()='Violet']")).getAttribute("class");
    System.out.println(violetButtonClass);
    String greyButtonText = driver.findElement(By.xpath("//button[text()='Grey']")).getText();
    System.out.println(greyButtonText);
    driver.close();
	
}
}

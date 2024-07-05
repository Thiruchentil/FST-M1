package activity17;

import java.util.List;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class activity17 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://v1.training-support.net/selenium/selects");
		System.out.println(driver.getTitle());
		WebElement dropdown = driver.findElement(By.id("single-select"));

		Select singleselect = new Select(dropdown);
		singleselect.selectByVisibleText("Option 2");
		 System.out.println(singleselect.getFirstSelectedOption().getText());
		singleselect.selectByIndex(3);
		System.out.println(singleselect.getFirstSelectedOption().getText());
		singleselect.selectByValue("4");
		System.out.println(singleselect.getFirstSelectedOption().getText());
		List<WebElement> alloptions = singleselect.getOptions();
		for (WebElement option : alloptions) {
			System.out.println(option.getText());
			driver.quit();
		}

	}

}

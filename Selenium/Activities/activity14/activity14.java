package activity14;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class activity14 {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://v1.training-support.net/selenium/tables");

		System.out.println(driver.getTitle());
		List<WebElement> cols = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr[1]/td"));
		System.out.println("Number of columns: " + cols.size());

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='sortableTable']/tbody/tr"));
		System.out.println("Number of rows: " + rows.size());

		WebElement cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Second row, second cell value: " + cellValue.getText());

		driver.findElement(By.xpath("//table[@id='sortableTable']/thead/tr/th")).click();

		cellValue = driver.findElement(By.xpath("//table[@id='sortableTable']/tbody/tr[2]/td[2]"));
		System.out.println("Second row, second cell value: " + cellValue.getText());

		List<WebElement> footer = driver.findElements(By.xpath("//table[@id='sortableTable']/tfoot/tr/th"));
		System.out.println("Cell values of the footer: ");
		for (WebElement cell : footer) {
			System.out.println(cell.getText());
		}
	}
}

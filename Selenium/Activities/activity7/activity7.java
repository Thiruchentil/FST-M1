package activity7;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class activity7 {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://v1.training-support.net/selenium/drag-drop");
		Actions action = new Actions(driver);
		System.out.println(driver.getTitle());
		WebElement Sourcelocator = driver.findElement(By.xpath("//img[@id='draggable']"));
		WebElement Destinationlocator1 = driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement Destinationlocator2 = driver.findElement(By.xpath("//div[@id='dropzone2']"));
		action.dragAndDrop(Sourcelocator, Destinationlocator1).build().perform();
		String dropzone1Verify = Destinationlocator1.findElement(By.xpath("//p[.='Dropped!']")).getText();
		if (dropzone1Verify.equals("Dropped!")) {
			System.out.println("Ball was dropped in dropzone 1");
		}
		action.dragAndDrop(Sourcelocator, Destinationlocator2).build().perform();
		String dropzone2Verify = Destinationlocator2.findElement(By.xpath("//p[.='Dropped!']")).getText();

		if (dropzone2Verify.equals("Dropped!")) {
			System.out.println("Ball was dropped in dropzone 2");
		}
		driver.quit();
	}

}

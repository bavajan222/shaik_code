package package5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException {
  
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop");
WebElement dargelment=driver.findElement(By.xpath("(//div[@id='div1'])[2]"));
WebElement dropelment=driver.findElement(By.xpath("//div[@id='div2']"));
Actions a1=new Actions(driver);

a1.dragAndDrop(dropelment, dargelment).perform();
	}

}

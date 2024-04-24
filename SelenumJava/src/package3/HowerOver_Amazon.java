package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//Hover over on Amazon website on using moveToElement()
public class HowerOver_Amazon {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in");
		Thread.sleep(1000);
		WebElement e1=driver.findElement(By.id("nav-link-acountList"));
		
		Actions a=new Actions(driver);
		a.moveToElement(e1).perform();
	}

}

package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAmazon_Relativexpath {
//Login to amazon application using relative xpath
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
			
		WebElement w=driver.findElement(By.xpath("(//input)[7]"));
		w.sendKeys("8309705173");
		driver.findElement(By.xpath("(//input)[10]")).click();
		
		driver.findElement(By.xpath("(//input)[9]")).sendKeys("Bavajan@123");
		
		driver.findElement(By.xpath("(//input)[11]")).click();
		
		
	}

}

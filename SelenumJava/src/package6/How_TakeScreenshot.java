package package6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_TakeScreenshot {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.name("q"));
			
		search.sendKeys("Java tutorial");
		Thread.sleep(4000);
		 List<WebElement> li=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		 int count=li.size();
		System.out.println(count);
		li.get(count-2).click();

		
		 }

	}



package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionality_Selenium2 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		WebElement search=driver.findElement(By.id("searchDropdownBox"));
		search.click();
		for(int i=0;i<=11;i++) {
			
			search.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(2000);
			
		}
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("world war");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}

}

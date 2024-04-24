package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionality_Selenium {

	public static void main(String[] args) {
		
		//launch google type india and press the enter button

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("india");
		search.sendKeys(Keys.ENTER);
	}

}

package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeysFunctionality_Selenium1 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://grotechminds.com/registeration-form");
		WebElement First_name=driver.findElement(By.id("firstName"));
		First_name.sendKeys("Shaik");
		First_name.sendKeys(Keys.CONTROL+"a");
		First_name.sendKeys(Keys.CONTROL+"c");
		
		WebElement Last_name=driver.findElement(By.id("lastName"));
		Last_name.sendKeys(Keys.CONTROL+"v");
	}

}

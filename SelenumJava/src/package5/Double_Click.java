package package5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement s=driver.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(driver);
		a1.doubleClick(s).perform();
		}

}

package package5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click_Anycomponent {

	public static void main(String[] args) {
		
		
		//right click can be done by with help of Actions class 

		//a1.contextclick()
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		WebElement s=driver.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(driver);
		a1.contextClick(s).perform();
		
	}

}

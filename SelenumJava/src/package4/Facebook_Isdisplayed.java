package package4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Isdisplayed {

	public static void main(String[] args) {
		

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	WebElement Login=driver.findElement(By.tagName("button"));
	
	boolean b1=Login.isDisplayed();
	boolean b2= Login.isEnabled();
	
	if(b1 && b2)
		
		
	{
		Login.click();
	}
	}

}

package package4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_Locator {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
WebElement w=driver.findElement(By.tagName("button"));
//button unique means it will work
w.click();
	}

}

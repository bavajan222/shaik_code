package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Click {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.Google.com");
		//driver.findElement(By.linkText("Gmail")).click();
		driver.findElement(By.partialLinkText("Gma")).click();
		driver.close();
	}

}

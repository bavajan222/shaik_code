package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.Google.com");
		driver.findElement(By.name("q")).sendKeys("India");
		driver.findElement(By.name("btnK")).click();
		
	}

}

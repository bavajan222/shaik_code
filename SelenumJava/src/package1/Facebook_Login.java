package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {
		
ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.id("email")).sendKeys("9652535264");
		driver.findElement(By.name("pass")).sendKeys("bavajan123");
		
		driver.findElement(By.name("login")).click();
	}

}

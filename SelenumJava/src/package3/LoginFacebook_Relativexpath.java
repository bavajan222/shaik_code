package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook_Relativexpath {
//Login to facebook application using relative xpath
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		WebElement us=driver.findElement(By.xpath("//input[@id='email']"));
		us.sendKeys("9652535264");
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("Bavajan@123");
		driver.findElement(By.xpath("(//button[@name='login'])")).click();
		
	}

}

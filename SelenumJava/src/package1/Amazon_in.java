package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_in {
  //1.launch amazon.in
  //2.click on customer service
  //4.click on your orders   
  //5.login to the application	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.findElement(By.linkText("Customer Service")).click();
        
		driver.findElement(By.className("ss-v2-box-image")).click();
		
		driver.findElement(By.name("email")).sendKeys("8309705173");
		driver.findElement(By.name("password")).sendKeys("Bavajan@123");
		
		driver.findElement(By.id("signInSubmit")).click();
	}

}

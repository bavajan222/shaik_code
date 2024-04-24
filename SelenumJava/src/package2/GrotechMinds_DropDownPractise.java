package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GrotechMinds_DropDownPractise {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://grotechminds.com/dropdown/");
		
	
	//	1. Write A Code To Select Demo2 Using Select By Visible Text.
		
WebElement drop1=driver.findElement(By.id("Choice1"));
		
   Select s1=new Select(drop1);
   s1.selectByVisibleText("Demo2");
 //2. Write A Code To Select SQL 15 Using Select By Value.
 
   WebElement drop2=  driver.findElement(By.name("Choice2"));
   Select s2=new Select(drop2); 
   s2.selectByValue("practice15");
   

   WebElement drop3=driver.findElement(By.name("Choice3 "));
   Select s3=new Select(drop3);
   s3.selectByIndex(10);
   
   
   
   
   
   
	}

}

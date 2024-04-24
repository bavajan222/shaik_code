package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Reg {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
        Thread.sleep(2000);
        
	driver.findElement(By.name("firstname")).sendKeys("Shaik");
	driver.findElement(By.name("lastname")).sendKeys("Bavajan");
	
	driver.findElement(By.name("reg_email__")).sendKeys("bavajanshaik78@gmail.com");
	
	driver.findElement(By.id("password_step_input")).sendKeys("Bavajan@123");
	
	WebElement date=driver.findElement(By.name("birthday_day"));
	Select s1=new Select(date);
	s1.selectByVisibleText("24");
	
	WebElement month=driver.findElement(By.name("birthday_month"));
	Select s2=new Select(month);
	s2.selectByValue("2");
	
	WebElement year=driver.findElement(By.name("birthday_year"));
    Select s3=new Select(year);
	s3.selectByVisibleText("1996");
	
	
	}

}

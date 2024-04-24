package package4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Html_IsEnabled {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/learningHTML1.html");
		WebElement lastname=driver.findElement(By.id("121"));
		
		System.out.println(lastname.isDisplayed());//true
		System.out.println(lastname.isEnabled());//false
		
		WebElement s=driver.findElement(By.name("name1"));	
		boolean b=s.isSelected();
		if(b==false) {
		s.click();
			
			
		}
		
		
	}

}

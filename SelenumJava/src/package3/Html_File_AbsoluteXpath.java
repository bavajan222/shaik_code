package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//absolute xpath
public class Html_File_AbsoluteXpath {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/learningHTML1.html");
driver.findElement(By.xpath("(/html/body/input)[1]")).sendKeys("Shaik Bavajan");

WebElement radio=driver.findElement(By.xpath("(/html/body/input)[4]"));
radio.click();
	}

}

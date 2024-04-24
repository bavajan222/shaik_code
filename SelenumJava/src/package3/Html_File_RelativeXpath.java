package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//relative Xpath
public class Html_File_RelativeXpath {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/User/Desktop/learningHTML1.html");
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("Bavajan123");

	}

}

package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_SearchXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.xpath("(//input)[5]")).sendKeys("shoes");
	}

}

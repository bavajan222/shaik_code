package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
   WebElement cat_dd=driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(cat_dd);
		//s1.selectByIndex(2);
		//s1.selectByValue("search-alias=amazon-pharmacy");
		s1.selectByVisibleText("Amazon Fashion");
		
  	}

}

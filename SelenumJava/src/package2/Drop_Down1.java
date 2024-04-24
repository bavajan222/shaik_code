package package2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down1 {
	//launch amazon inida form categeory search books and type world war
		//click on search  button
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	   WebElement cat_dd=driver.findElement(By.id("searchDropdownBox"));
	   
	   Select s1=new Select(cat_dd);
	   s1.selectByVisibleText("Books");
	   WebElement s2=driver.findElement(By.id("twotabsearchtextbox"));
	   s2.sendKeys("World War");
	  driver.findElement(By.id("nav-search-submit-button")).click();

}}

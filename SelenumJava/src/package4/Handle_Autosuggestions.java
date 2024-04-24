package package4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
	
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
WebElement search=driver.findElement(By.name("q"));
	
search.sendKeys("Java tutorial");
Thread.sleep(4000);
 List<WebElement> li=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
 
System.out.println(li.size());
//li.get(3).click();

 for(int i=0;i<li.size();i++)
 {
	 
	String litext=li.get(i).getText();
	System.out.println(litext);
	
	if(li.contains("Java tutorial oracle")) {
		
		li.get(i).click();
		break;
	}
 }


	}

}

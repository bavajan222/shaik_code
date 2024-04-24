package package6;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_AllLinks {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	List<WebElement> allLinks =driver.findElements(By.tagName("a"));
	   
	System.out.println(allLinks.size());
	
	for(int i=0;i<=allLinks.size()-1;i++) {
		
		WebElement a1=allLinks.get(i);
		//String url=a1.getAttribute("href");//all the urls
		String url=a1.getText();// all the link text messages
		System.out.println(url);
	}
	
	
	
	
	
}}




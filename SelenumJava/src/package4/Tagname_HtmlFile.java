package package4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_HtmlFile {

	public static void main(String[] args) {
		
	ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/User/Desktop/learningHTML1.html");
	driver.findElement(By.tagName("a")).click();
		
	}

}

package package3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_XpathTextMsg {
	//  //tagname[.='with text']
//Using (URL for nakuri registration shared by Manish)
	//click on continue with Google with xpath using text message 
	public static void main(String[] args) {
		
		
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
     
     driver.findElement(By.xpath("//span[.='Google']")).click();
     
	}

}

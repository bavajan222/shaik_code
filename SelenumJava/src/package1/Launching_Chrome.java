package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launching_Chrome {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Google.com");
		
		Thread.sleep(2000);
		
		
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	

}

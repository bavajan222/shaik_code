package package1;

import org.openqa.selenium.edge.EdgeDriver;

public class Launching_EdgeDriver {

	public static void main(String[] args) {
		
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		driver.close();
	}

}

package Redbus;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


 public class Desired {
	public static void main(String[] args) {
		
		WebDriverManager.edgedriver().setup();
		//DesiredCapabilities s = new DesiredCapabilities();
		EdgeOptions l = new EdgeOptions();
		l.addArguments("start--maximaized");
//		options.addArguments("disable-notifications");
//		options.addArguments("disable-popups");
//		options.addArguments("start-maximized");
//		options.addArguments("--headless");
		WebDriver driver = new EdgeDriver(l);
		driver.get("https://www.redbus.in/");
		
		
		
//		System.out.println("Completed");
		
	}

}
 


































import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DOM {
	private static WebElement element;

	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\ADMIN\\eclipse-workspace\\GetManage\\target\\drive\\msedgedriver.exe");
	    WebDriverManager.edgedriver().setup(); 
     	WebDriver driver = new EdgeDriver();
    	String s ="https://www.instagram.com/";
	driver.get(s);
//		driver.navigate().to(s);
	driver.manage().window().maximize();
//	driver.manage().window().minimize();
	driver.switchTo().frame("frame1");
	driver.switchTo().frame("frame3");
	
	WebElement element = driver.findElement(By.xpath(""));
	System.out.println(element.getText());
   
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	    WebElement F = driver.findElement(By.name("username"));
		F.sendKeys("subeka");

		WebElement F1 = driver.findElement(By.xpath("//input[@aria-label=\"Password\"]"));
		F1.sendKeys("1202");

		String a = F.getAttribute("name");
		System.out.println(a);
		
		String M = F1.getAttribute("xpath");
		System.out.println(M);

		WebElement F2 = driver.findElement(By.xpath("(//div[@class=\"_ab32\"] [1])"));
		F2.click();
		
		
	}
		
	
	}
		

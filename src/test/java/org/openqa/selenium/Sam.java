package org.openqa.selenium;

	
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WindowType;
	import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Sam{
		public static void main(String[] args) throws InterruptedException, AWTException, IOException {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			//String s ="https://www.facebook.com/";
			String url ="https://demo.guru99.com/test/drag_drop.html";
			//driver.get("https://www.flipkart.com//");
			driver.navigate().to(url);
			
			driver.manage().window().maximize();
//			
//			WebElement drag = driver.findElement(By.xpath("(//a[@class=\"button button-orange\"])[5]"));
//		WebElement drop = driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
//			
//			WebElement drag1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
//			WebElement drop1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
//			
//			WebElement drag2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
//			WebElement drop2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
//			
//			WebElement drag3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
//			WebElement drop3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
//			
//			
//			Actions a = new Actions(driver);
//			a.dragAndDrop(drag, drop).build().perform();
//			a.dragAndDrop(drag1, drop1).build().perform();
//			a.dragAndDrop(drag2, drop2).build().perform();
//			a.dragAndDrop(drag3, drop3).build().perform();
//			
//			TakesScreenshot l =(TakesScreenshot)driver;
//			File f = l.getScreenshotAs(OutputType.FILE);
//			File m = new File("C:\\Users\\ADMIN\\eclipse-workspace\\Domstructure\\target\\msedgedriver.exe\\Shot.png");
//			FileUtils.copyFile(f, m);
//			
			
//			WebElement mob = driver.findElement(By.xpath("//span[text()='Mobiles']"));
//			Actions a = new Actions(driver);
//			a.moveToElement(mob).click().perform();
			
//			WebElement user = driver.findElement(By.id("email"));
//		    user.sendKeys("sube");
//		    Actions a = new Actions(driver);
//		    a.doubleClick(user).build().perform();
//		    a.contextClick(user).build().perform();
//		    
//		    Robot r = new Robot();
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			
//			r.keyPress(KeyEvent.VK_DOWN);
//			r.keyRelease(KeyEvent.VK_DOWN);
//			
//			r.keyPress(KeyEvent.VK_ENTER);
//			r.keyRelease(KeyEvent.VK_ENTER);
//			
//			r.keyPress(KeyEvent.VK_TAB);
//			r.keyRelease(KeyEvent.VK_TAB);
//			
//			r.keyPress(KeyEvent.VK_CONTROL);
//			r.keyPress(KeyEvent.VK_V);
//			
//			r.keyRelease(KeyEvent.VK_CONTROL);
//			r.keyRelease(KeyEvent.VK_V);
//			
		
			
			
			
			
			WebElement F = driver.findElement(By.id("email"));
			F.sendKeys("subeka");

			WebElement F1 = driver.findElement(By.name("pass"));
			F1.sendKeys("1202");
			Thread.sleep(3000);

			String a = F1.getAttribute("name");
			System.out.println(a);

			WebElement F2 =driver.findElement(By.partialLinkText("Forgotten account"));
			F2.click();
			
			
			
		}}
	
	
	

package Redbus;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;

public class Surya {
     public static void main(String[] args) {
	

     WebDriverManager.edgedriver().setup();
     EdgeOptions options = new EdgeOptions();
     options.addArguments("disable-notifications");
     options.addArguments("disable-popups");
     options.addArguments("start-maximized");
     options.addArguments("--headless");
     WebDriver driver = new EdgeDriver(options);
     driver.get("https://www.redbus.in");
     System.out.println("Completed");

   }
}

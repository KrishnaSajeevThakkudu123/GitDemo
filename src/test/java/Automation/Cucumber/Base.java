package Automation.Cucumber;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	
	public static WebDriver getDriver() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Krishna\\Cucumber BDD\\Workspace\\Cucumber\\src\\test\\java\\Automation\\Cucumber\\global.properties");
		prop.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "E:\\Krishna\\Cucumber BDD\\chrome driver\\9five\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		
		return driver;
		
	}
	
	

}

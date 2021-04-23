package Btes_HRMTestBase;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public Testbase () 
	{
		//to read  data from configuration file creating- input stream object
		try {
			FileInputStream ip= new FileInputStream("C:\\Users\\ankit\\eclipse-workspace\\Btes_HRM\\src\\test\\java\\Btes_HRMConfiguration\\config.properties");
		
			//initializing the Properties class
			prop = new Properties();
			
			prop.load(ip);
		}
			
			
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.getStackTrace();
			}

		
				
	}
	public static void intilization() {
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		driver.manage().window().maximize();
	
	}
}

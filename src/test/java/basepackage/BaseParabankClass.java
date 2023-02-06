package basepackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseParabankClass {
	public static Properties prop= new Properties();      //properties is a class and object is created to read contents of config.properties
	public static WebDriver driver;                       //declaring globally under class 
	
	//Step1
	public BaseParabankClass() {                       // Creating constructor
		try {
	FileInputStream file=new FileInputStream("C:\\Users\\ruchi\\eclipse-workspace\\ParabankProject\\src\\test\\java\\environmentvariables\\Config.properties");
			//Code to read contents of config.properties file. In bracket path of file in inverted commas.   
	prop.load(file);               //Read properties of file
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();                //To print e
	}
	catch (IOException a) {
		a.printStackTrace();    //To print a
	}
	}
		//Step 2
	
		@SuppressWarnings("deprecation")
		public static void initiate() {
			//driver path webdriver gecko
			//maximize window,pagelaod, wait time,getting url
			String browsername=prop.getProperty("browser");
			 if (browsername.equals("Chrome")) {
			    	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			    	driver=new ChromeDriver();
			    }
			    	else if(browsername.equals("Firefox")) {
			        System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			        driver=new FirefoxDriver();
			    	}
			 driver.manage().window().maximize();
			   driver.manage().timeouts().pageLoadTimeout(utility.TimeUtils.timepage, TimeUnit.SECONDS);
			    driver.get(prop.getProperty("url"));
			
			
			
			
			
			
					
}
	}
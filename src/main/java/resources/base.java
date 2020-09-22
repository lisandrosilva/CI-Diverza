package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class base {
	
	public static WebDriver driver;
	public  Properties prop;
	public WebDriver initializeDriver() throws IOException 
	
	{
		prop = new Properties();
	    //FileInputStream System.getProperty("user.dir")
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"/src/main/java/resources/data.properties");
		
		prop.load(file);
		
		//String browserName = prop.getProperty("browser");
		//Field field = Class.getField("driver");
		String browserName = System.getProperty("browser");
		
		System.out.println(browserName);
		
	if (browserName.contains("chrome"))
	{
		//Execute
		
			System.setProperty("webdriver.chrome.driver","/Users/lisandrosilva/Documents/Drivers/chromedriver ");
			       ChromeOptions options = new ChromeOptions();
			       
	         if(browserName.contains("headless")) {

                 options.addArguments("--headless");
//	             //options.addArguments("--disable-gpu");
	         }
             
	 driver = new ChromeDriver(options);	
	   
		
		}            
		
			    

		else if (browserName.equals("Safari")) {
			
			//Execute
			//driver = new SafariDriver();
		}
		else if (browserName.equals("FireFox")) {
			System.setProperty("webdriver.gecko.driver","/Users/lisandrosilva/Documents/Drivers/geckodriver 3");
                           driver = new FirefoxDriver();	
			//Execute
		      // driver = new FirefoxDriver();
		}
		else if (browserName.equals("IE")) {
			//Execute
			    // driver = new InternetExplorerDriver();
		}
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		return driver;
	}
	public String getScreenShotPath(String testCaseName, WebDriver driver) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"/reports"+testCaseName+".png";
		FileUtils.copyFile(source, new File(destinationFile));
		return destinationFile;
		
	}

}

package com.mkyong.sauce.labs;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.mkyong.hashing.busonfiscal.LandingPageBuson;

public class SampleSauceTest {

	public static final String USERNAME = "lisandrodvz19";
	public static final String ACCESS_KEY = "622df41d-d705-416c-9d55-5c1a91c6a2df";
	public static final String URL = "https://portalqa.diverza.com" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";
	  
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		
		MutableCapabilities sauceOptions = new MutableCapabilities();

		EdgeOptions browserOptions = new EdgeOptions();
		browserOptions.setCapability("platformName", "macOS 10.15");
		browserOptions.setCapability("browserVersion", "80.0");
		browserOptions.setCapability("sauce:options", sauceOptions);
		
		WebDriver driver = new RemoteWebDriver(new java.net.URL(URL),sauceOptions);
		
		
		
			 
			       LandingPageBuson ld = new LandingPageBuson(driver);
			
			
			ld.ingPortal().sendKeys("lisandro.silva");
			ld.ingPortal1().sendKeys("Diverza1*");
			ld.ingPortal11().click();
			Thread.sleep(2000);
			ld.Search().click();
			Thread.sleep(2000);
			ld.ListaRFC().sendKeys("CACX7605101P8");
			Thread.sleep(2000);
			ld.SearchRFC().click();
			Thread.sleep(2000);
			ld.ValidacionOK().click();
			Thread.sleep(2000);
			ld.ListaRFC().clear();
			Thread.sleep(2000);
			ld.CloseSearch().click();
			Thread.sleep(2000);
			ld.SignOut().click();
			Thread.sleep(2000);
			ld.CloseBotton().click();
			
	}

}




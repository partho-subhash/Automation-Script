package com.parthotech.automation;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class MyPermitMoreOption {
	
	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		capabilities.setCapability("useNewWDA", false);
		capabilities.setCapability("xcodeSigningId", "iPhone Developer");
		capabilities.setCapability(MobileCapabilityType.UDID, "00008020-000E58583AE9002E");
		capabilities.setCapability(MobileCapabilityType.APP,"/Users/subhash/Library/Developer/Xcode/DerivedData/MOBIINSPECT-awgqiirvazwfohftmbchrjryjhlw/Build/Products/Debug-iphoneos/MOBIINSPECT.app");
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XR");
		capabilities.setCapability("updatedWDABundleId", "com.parthotech.mobiinspect.cob");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		IOSDriver<IOSElement> driver = new IOSDriver(url, capabilities);
		
		WebElement entervalidUN = driver.findElementsByName("Username").get(1);
	    entervalidUN.clear();
	    entervalidUN.sendKeys("ssalimidi");
	    
		WebElement validpassenter = driver.findElementsByName("Password").get(1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		validpassenter.sendKeys("P@rth0tech22");
		
		
		WebElement LoginButtonClik= (WebElement) driver.findElementByAccessibilityId("Login");
		LoginButtonClik.click();
		
		
		WebElement ClickPermit= (WebElement) driver.findElementByAccessibilityId("My Permits");
		ClickPermit.click();
		
	
	try {
			IOSElement okButtonElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
			okButtonElement.click();
			
			System.out.println("My Pert working");
		}
		catch(Exception e)
		{
        
			IOSElement titlecheck = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("MY PERMITS")));
	
	        String altclick = titlecheck.getText();
	        Assert.assertEquals(altclick, "MY PERMITS");
	        System.out.println("My Permit List Assert working");
	      
	        WebElement MoreOptionClick = (WebElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"close arrow dropleft\"]");
	        MoreOptionClick.click();
	        MoreOptionClick.click();
	        MoreOptionClick.click();
	        WebElement  MapMenu = (WebElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"close map\"]");
			MapMenu.click();
			
			IOSElement titlechck = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("MY PERMITS MAP")));
			String alrtclick = titlechck.getText();
	        Assert.assertEquals(altclick, "MY PERMITS");
	        System.out.println("MAP View Assert working");
	        
	        WebElement moreoptinClick = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
			moreoptinClick.click();
	        WebElement OptimalMoreOptionClick = (WebElement) driver.findElementByName("close Optimal Route");
	        OptimalMoreOptionClick.click();
	        
	        try
	        {
	        	IOSElement okButtonElement = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
				okButtonElement.click();
				System.out.println("Can't test because of Map into not radius");
	        	
				WebElement moreoptinClck = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
	        	moreoptinClck.click();
	 	        WebElement closemap = (WebElement) driver.findElementByName("close map");
	 	        closemap.click();
	        	moreoptinClck.click();
	        	WebElement closelist = (WebElement) driver.findElementByName("close list");
	        	closelist.click();
	        	
				
				
	        }
	        
	        catch (Exception e2)
	        {
	        	WebElement moreoptinClck = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
	        	moreoptinClck.click();
	 	        WebElement closemap = (WebElement) driver.findElementByName("close map");
	 	       closemap.click();
	 				
	        	
	        }
	        
	       
		}
	
	
	}

}

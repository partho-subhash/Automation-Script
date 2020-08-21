package com.parthotech.automation;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class OtherInspector {
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
			
			
			WebElement ClickPermit= (WebElement) driver.findElementByAccessibilityId("Other Inspectors");
			ClickPermit.click();
			
			
			 driver.findElement(By.id("close add")).click();
			 
			 WebElement userComment1 = driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"“searchinspector”\"]");
			 userComment1.sendKeys("john");
			 WebElement ClickSubmit= (WebElement) driver.findElementByAccessibilityId("Submit");
			 ClickSubmit.click();
			 WebElement selectoption = driver.findElementByXPath("//XCUIElementTypeOther[@name=\"Ionic App\"]/XCUIElementTypeSwitch[2]");
			 selectoption.click();
			 WebElement SelectAdd = (WebElement) driver.findElementByAccessibilityId("Add");
			 SelectAdd.click();
			 WebElement SelectPermit = (WebElement) driver.findElementByAccessibilityId("PERMITS");
			 SelectPermit.click();
			 try {
					IOSElement okButtonElement = (IOSElement) new WebDriverWait(driver, 30)
			                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
					okButtonElement.click();
					
					System.out.println("PERMIT NOT LISTING");
				}
				catch(Exception e)
				{
			
					System.out.println("PERMIT LISTING");
					
				}
			 
			 WebElement ClickOthrInsp= (WebElement) driver.findElementByAccessibilityId("Other Inspectors");
			 ClickOthrInsp.click();

			 WebElement SelctPermit = (WebElement) driver.findElementByAccessibilityId("COMPLAINTS");
			 SelctPermit.click();
			 
			 try {
					IOSElement okButtonElement = (IOSElement) new WebDriverWait(driver, 30)
			                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
					okButtonElement.click();
					
					System.out.println("COMPLAINTS NOT LISTING");
				}
				catch(Exception e1)
				{
			
					System.out.println("COMPLAINTS LISTING");
					
				}
			 
		 
	}
	
}
	
	
	

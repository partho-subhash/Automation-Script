package com.parthotech.automation;

import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import java.net.MalformedURLException;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AttemptsBackAssert {

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
				
				System.out.println("Permit not Listing");
			}
			catch(Exception e)
			{
	        
				IOSElement titlecheck = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("MY PERMITS")));
		
		        String altclick = titlecheck.getText();
		        Assert.assertEquals(altclick, "MY PERMITS");
		        System.out.println("My Permit List Assert working");
		        
		       
		
		        WebElement selectpermit = (WebElement) driver.findElementByAccessibilityId("arrow dropright-circle-outline");
				selectpermit.click();
				
				WebElement enterResult1 = (WebElement) driver.findElementByAccessibilityId("Enter Result");
				enterResult1.click();		
				
//				WebElement userComment11 = driver.findElementsByName("commentBoxTitle").get(1);
//				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				//userComment11.sendKeys("Test");
				
				WebElement arrow1Dropdown = (WebElement) driver.findElementByAccessibilityId("arrow dropdown");
				arrow1Dropdown.click();
				
				WebElement arrow1Up1 = (WebElement) driver.findElementByAccessibilityId("arrow up");
				arrow1Up1.click();
				
				WebElement set1Value1 = (WebElement) driver.findElementByAccessibilityId("Set");
				set1Value1.click();
				
				WebElement arrowBack = (WebElement) driver.findElementByAccessibilityId("arrow back");
				arrowBack.click();
				
//				IOSElement alertTitleElement1 = (IOSElement) new WebDriverWait(driver, 30)
//		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Navigating away from this page will lose any unsaved data in this inspection report. To save the data, tap on Cancel then save the report as draft. Do you want to continue without saving data?")));
//				String alertTitle = alertTitleElement1.getText();
				IOSElement alertTitleElement1 = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Navigating away from this page will lose any unsaved data in this inspection report. To save the data, tap on Cancel then save the report as draft. Do you want to continue without saving data?\"]")));
				String alertTitle = alertTitleElement1.getText();
				

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		        Assert.assertEquals(alertTitle, "Navigating away from this page will lose any unsaved data in this inspection report. To save the data, tap on Cancel then save the report as draft. Do you want to continue without saving data?");
		        IOSElement okButtonElement = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Confirm")));
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				okButtonElement.click();
				System.out.println("Back Button Assert working");
				
				WebElement enterResult = (WebElement) driver.findElementByAccessibilityId("Enter Result");
				enterResult.click();		
				
				
				WebElement arrowDropdown = (WebElement) driver.findElementByAccessibilityId("arrow dropdown");
				arrowDropdown.click();
				
				WebElement arrowUp = (WebElement) driver.findElementByAccessibilityId("arrow up");
				arrowUp.click();
				
				WebElement setValue = (WebElement) driver.findElementByAccessibilityId("Set");
				setValue.click();
				
				WebElement menuclick = (WebElement) driver.findElementByAccessibilityId("menu");
				menuclick.click();
				System.out.println("Bing"+menuclick);
				
				IOSElement alertTitleElement = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.xpath("//XCUIElementTypeStaticText[@name=\"Navigating away from this page will lose any unsaved data in this inspection report. To save the data, tap on Cancel then save the report as draft. Do you want to continue without saving data?\"]")));
				String alertTile = alertTitleElement.getText();
				

				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		        Assert.assertEquals(alertTile, "Navigating away from this page will lose any unsaved data in this inspection report. To save the data, tap on Cancel then save the report as draft. Do you want to continue without saving data?");
		        IOSElement okButonElement = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Confirm")));
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

				okButonElement.click();
				
				System.out.println("Menu Button Assert working");
				
				}
    
		}
}
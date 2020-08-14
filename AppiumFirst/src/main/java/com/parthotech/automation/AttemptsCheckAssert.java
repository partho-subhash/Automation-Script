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

public class AttemptsCheckAssert {

		public static void main(String[] args) throws MalformedURLException {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		
			capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
		
			capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
			capabilities.setCapability("useNewWDA", false);
		
			capabilities.setCapability("xcodeSigningId", "iPhone Developer");
			capabilities.setCapability(MobileCapabilityType.UDID, "00008020-000E58583AE9002E");
			capabilities.setCapability(MobileCapabilityType.APP,"/Users/subhash/Library/Developer/Xcode/DerivedData/MOBIINSPECT-ganjvlicoiggofebwkgkumbbqyoa/Build/Products/Debug-iphoneos/MOBIINSPECT.app");
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone XR");
			capabilities.setCapability("updatedWDABundleId", "com.parthotech.mobiinspect.cob");
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			IOSDriver<IOSElement> driver = new IOSDriver(url, capabilities);
			
			WebElement entervalidUN = driver.findElementsByName("Username").get(1);
		    entervalidUN.clear();
		    entervalidUN.sendKeys("psejwani");
		    
			WebElement validpassenter = driver.findElementsByName("Password").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			validpassenter.sendKeys("P@rth0tech!!");
			
			
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
		        
		       
		
		        WebElement selectpermit = (WebElement) driver.findElementByAccessibilityId("arrow dropright-circle-outline");
				selectpermit.click();
				
				IOSElement PermitDetails = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("PERMIT DETAILS")));
		
		        String PermitDetailsAssert = PermitDetails.getText();
		        Assert.assertEquals(PermitDetailsAssert, "PERMIT DETAILS");
		        System.out.println("Permit listing Assert working");
				
		        WebElement PreviousAtempts= driver.findElementByAccessibilityId("Previous Attempts");
		        PreviousAtempts.click();
				
				IOSElement okBttnElt = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
		        okBttnElt.click();
				
		        System.out.println("Pervious Attempts Checked");
				
				
				WebElement enterResult1 = (WebElement) driver.findElementByAccessibilityId("Enter Result");
				enterResult1.click();		
				
				
				
				WebElement userComment11 = driver.findElementsByName("commentBoxTitle").get(1);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
				userComment11.sendKeys("Test");
				
				WebElement arrowDropdown11 = (WebElement) driver.findElementByAccessibilityId("arrow dropdown");
				arrowDropdown11.click();
				
				WebElement arrowUp11 = (WebElement) driver.findElementByAccessibilityId("arrow down");
				arrowUp11.click();
				
				WebElement setValue11 = (WebElement) driver.findElementByAccessibilityId("Cancel");
				setValue11.click();
				
				WebElement arrow1Dropdown = (WebElement) driver.findElementByAccessibilityId("arrow dropdown");
				arrow1Dropdown.click();
				
				WebElement arrow1Up1 = (WebElement) driver.findElementByAccessibilityId("arrow up");
				arrow1Up1.click();
				
				WebElement set1Value1 = (WebElement) driver.findElementByAccessibilityId("Set");
				set1Value1.click();
				
			    WebElement resultCode = (WebElement) driver.findElementByAccessibilityId("Result code");
				resultCode.click();
				
				WebElement pass = (WebElement) driver.findElementByAccessibilityId("Complete");
				pass.click();
				
				WebElement selectOK = (WebElement) driver.findElementByAccessibilityId("OK");
				selectOK.click();
				
				WebElement permitSubmit = (WebElement) driver.findElementByAccessibilityId("Submit Now");
				permitSubmit.click();
				
				WebElement submitPermit = (WebElement) driver.findElementByAccessibilityId("OK");
				submitPermit.click();
				
				WebElement submitPermit1 = (WebElement) driver.findElementByAccessibilityId("OK");
				submitPermit1.click();
				System.out.println("My Permit List Assert working");

		}
		
		
	}
    

}
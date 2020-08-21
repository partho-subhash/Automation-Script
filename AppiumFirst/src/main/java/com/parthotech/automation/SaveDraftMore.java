package com.parthotech.automation;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class SaveDraftMore {
	
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
			
			WebElement saveDraft = (WebElement) driver.findElementByAccessibilityId("Saved Drafts");
			saveDraft.click();
			
			
			try {
				IOSElement okButtonElement = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
				okButtonElement.click();
				

				WebElement myPermits = (WebElement) driver.findElementByAccessibilityId("My Permits");
				myPermits.click();
				try {
					IOSElement okButonElement = (IOSElement) new WebDriverWait(driver, 30)
			                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
					okButonElement.click();
					System.out.println(" No Permits Assigned");
				}
				catch (Exception e) {
					
					
				
				
				WebElement selectpermit = (WebElement) driver.findElementByAccessibilityId("arrow dropright-circle-outline");
				selectpermit.click();
				
				WebElement enterResult = (WebElement) driver.findElementByAccessibilityId("Enter Result");
				enterResult.click();
				
				WebElement userComment1 = driver.findElementsByName("commentBoxTitle").get(1);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				userComment1.clear();
				userComment1.sendKeys("Save Draft");
				
				WebElement arrowDropdown = (WebElement) driver.findElementByAccessibilityId("arrow dropdown");
				arrowDropdown.click();
				
				WebElement arrowUp = (WebElement) driver.findElementByAccessibilityId("arrow up");
				arrowUp.click();
				
				WebElement setValue = (WebElement) driver.findElementByAccessibilityId("Set");
				setValue.click();
				
				WebElement resultCode = (WebElement) driver.findElementByAccessibilityId("Result code");
				resultCode.click();
				
				WebElement pass = (WebElement) driver.findElementByAccessibilityId("Communication");
				pass.click();
				
				WebElement selectOK = (WebElement) driver.findElementByAccessibilityId("OK");
				selectOK.click();
				
				WebElement permitSubmit = (WebElement) driver.findElementByAccessibilityId("Save As Draft");
				permitSubmit.click();
				
				WebElement submitPermit = (WebElement) driver.findElementByAccessibilityId("OK");
				submitPermit.click();
				
				WebElement subsaveDraft = (WebElement) driver.findElementByAccessibilityId("Saved Drafts");
				subsaveDraft.click();
				WebElement moreoptionClick = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
				moreoptionClick.click();
				
				WebElement enterResultpage = (WebElement) driver.findElementByAccessibilityId("close done all");
				enterResultpage.click();
				
				WebElement moreoption = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
				moreoption.click();
				
				WebElement minuteWorkedset = (WebElement) driver.findElementByAccessibilityId("close close");
				minuteWorkedset.click();
				
				WebElement moreoptionOpen = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
				moreoptionOpen.click();
				
				
				WebElement moreClose = (WebElement) driver.findElementByAccessibilityId("close done all");
				moreClose.click();
				
				WebElement moreOpen = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
				moreOpen.click();
				
				WebElement closeTrash = (WebElement) driver.findElementByAccessibilityId("close trash");
				closeTrash.click();
		
				WebElement confirm = (WebElement) driver.findElementByAccessibilityId("Confirm");
				confirm.click();
				
				
				IOSElement alertTitlElent1 = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("All selected Drafts deleted")));
				String aTitle = alertTitlElent1.getText();
		        Assert.assertEquals(aTitle, "All selected Drafts deleted");
		        IOSElement oKBTElement = (IOSElement) new WebDriverWait(driver, 30)
		                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
		        oKBTElement.click();
				System.out.println("Permits Successfully Delete from Saved Draft");
					
				}
				
			}
			catch(Exception e)
			{
			
				WebElement moreoptionClick = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
				moreoptionClick.click();
				
				WebElement enterResultpage = (WebElement) driver.findElementByAccessibilityId("close done all");
				enterResultpage.click();
				
				
				
				WebElement moreoption = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
				moreoption.click();
				
				WebElement minuteWorkedset = (WebElement) driver.findElementByAccessibilityId("close close");
				minuteWorkedset.click();
				
				WebElement moreoptionOpen = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
				moreoptionOpen.click();
				
				
				WebElement moreClose = (WebElement) driver.findElementByAccessibilityId("close done all");
				moreClose.click();
				
				WebElement moreOpen = (WebElement) driver.findElementByAccessibilityId("close arrow dropleft");
				moreOpen.click();
				
				WebElement closeTrash = (WebElement) driver.findElementByAccessibilityId("close trash");
				closeTrash.click();
		
				WebElement confirm = (WebElement) driver.findElementByAccessibilityId("Confirm");
				confirm.click();
				
				WebElement ok = (WebElement) driver.findElementByAccessibilityId("OK");
				ok.click();
		
		
				System.out.println(" Successfully Submit Permits from Saved Draft");
				
			
			}
			
			
					
					
			}
	


}

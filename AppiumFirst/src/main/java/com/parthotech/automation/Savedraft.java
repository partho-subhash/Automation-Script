package com.parthotech.automation;

// Saved Draft, Back Button, Re-Save Draft, Then Submit Permit.

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Savedraft {
	private static Logger SavedDraftCheck = Logger.getLogger(Login.class.getName());

	public static void main(String[] args) throws MalformedURLException {

		SavedDraftProcess();

	}

	public static void SavedDraftProcess() throws MalformedURLException {
	
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
	
		WebElement webUserPassword = driver.findElementsByName("Password").get(1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		webUserPassword.sendKeys("P@rth0tech!!");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement loginButton = (WebElement) driver.findElementByAccessibilityId("Login");
		loginButton.click();
		
		// $$$$$$$$$$$            Save Draft               $$$$$$$$$$$$$$$$$$$$$$$$$$
		
		
		WebElement myPermits = (WebElement) driver.findElementByAccessibilityId("My Permits");
		myPermits.click();
		
		WebElement selectpermit = (WebElement) driver.findElementByAccessibilityId("arrow dropright-circle-outline");
		selectpermit.click();
		
		WebElement enterResult = (WebElement) driver.findElementByAccessibilityId("Enter Result");
		enterResult.click();
		
		WebElement userComment1 = driver.findElementsByName("commentBoxTitle").get(1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		userComment1.sendKeys("Save Draft");
		
		WebElement arrowDropdown = (WebElement) driver.findElementByAccessibilityId("arrow dropdown");
		arrowDropdown.click();
		
		WebElement arrowUp = (WebElement) driver.findElementByAccessibilityId("arrow up");
		arrowUp.click();
		
		WebElement setValue = (WebElement) driver.findElementByAccessibilityId("Set");
		setValue.click();
		
		WebElement resultCode = (WebElement) driver.findElementByAccessibilityId("Result code");
		resultCode.click();
		
		WebElement pass = (WebElement) driver.findElementByAccessibilityId("Complete");
		pass.click();
		
		WebElement selectOK = (WebElement) driver.findElementByAccessibilityId("OK");
		selectOK.click();
		
		WebElement permitSubmit = (WebElement) driver.findElementByAccessibilityId("Save As Draft");
		permitSubmit.click();
		
		WebElement submitPermit = (WebElement) driver.findElementByAccessibilityId("OK");
		submitPermit.click();
		
		System.out.println("Saved Draft Successfully");
		
		// $$$$$$$$$$$            Back Button               $$$$$$$$$$$$$$$$$$$$$$$$$$
		
		
		
		WebElement saveDraft = (WebElement) driver.findElementByAccessibilityId("Saved Drafts");
		saveDraft.click();
		
		WebElement selectdraftpermit = (WebElement) driver.findElementByAccessibilityId("arrow dropright-circle-outline");
		selectdraftpermit.click();
		
		WebElement enterResultpage = (WebElement) driver.findElementByAccessibilityId("Enter Result");
		enterResultpage.click();
	
		WebElement userComment = driver.findElementsByName("commentBoxTitle").get(1);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		userComment.clear();
		userComment.sendKeys("Back Button");
		
		WebElement arrowBack = (WebElement) driver.findElementByAccessibilityId("arrow back");
		arrowBack.click();
		
		WebElement confirm = (WebElement) driver.findElementByAccessibilityId("Confirm");
		confirm.click();
		System.out.println("Back Button Successfully");
		
		
		// $$$$$$$$$$$            Re-Save Draft               $$$$$$$$$$$$$$$$$$$$$$$$$$
		
	
		WebElement enterResultpage1 = (WebElement) driver.findElementByAccessibilityId("Enter Result");
		enterResultpage1.click();
		
		WebElement minuteWorked = (WebElement) driver.findElementByAccessibilityId("arrow dropdown");
		minuteWorked.click();
		
		WebElement minuteWorkedset = (WebElement) driver.findElementByAccessibilityId("arrow up");
		minuteWorkedset.click();
		
		WebElement setValue1 = (WebElement) driver.findElementByAccessibilityId("Set");
		setValue1.click();
		
		WebElement permitSubmit1 = (WebElement) driver.findElementByAccessibilityId("Re-Save Draft");
		permitSubmit1.click();
		
		
		WebElement submitPermit1 = (WebElement) driver.findElementByAccessibilityId("OK");
		submitPermit1.click();
		
		System.out.println("Re Saved Draft Successfully");
		
		
		// $$$$$$$$$$$            Submit Save Draft               $$$$$$$$$$$$$$$$$$$$$$$$$$
		

		WebElement subsaveDraft = (WebElement) driver.findElementByAccessibilityId("Saved Drafts");
		subsaveDraft.click();
		
		WebElement selectdratpermit = (WebElement) driver.findElementByAccessibilityId("arrow dropright-circle-outline");
		selectdratpermit.click();
		
	
		WebElement enterResult1 = (WebElement) driver.findElementByAccessibilityId("Enter Result");
		enterResult1.click();
		
		WebElement minuteWork = (WebElement) driver.findElementByAccessibilityId("arrow dropdown");
		minuteWork.click();
		
		WebElement minuteWorkset = (WebElement) driver.findElementByAccessibilityId("arrow down");
		minuteWorkset.click();
		
		WebElement setValuee1 = (WebElement) driver.findElementByAccessibilityId("Set");
		setValuee1.click();
		
		
		WebElement permitSubmi1t = (WebElement) driver.findElementByAccessibilityId("Submit Now");
		permitSubmi1t.click();
		
		
		WebElement submitPermitt1 = (WebElement) driver.findElementByAccessibilityId("OK");
		submitPermitt1.click();

		WebElement submitPermit2 = (WebElement) driver.findElementByAccessibilityId("OK");
		submitPermit2.click();
		
		WebElement submitPermit3 = (WebElement) driver.findElementByAccessibilityId("OK");
		submitPermit3.click();
		
		System.out.println(" Successfully Submit Permits from Saved Draft");
			
			
	
	}

}


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

public class SavedDraftAssert {

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
			
			System.out.println("Saved Draft Successfully");
			
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
			
			
			IOSElement alertTitlElent1 = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Your report is added to the pending submission list and will be submitted shortly.")));
			String aTitle = alertTitlElent1.getText();
	        Assert.assertEquals(aTitle, "Your report is added to the pending submission list and will be submitted shortly.");
	        IOSElement oKBTElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        oKBTElement.click();
			System.out.println(" Successfully Submit Permits from Saved Draft");
				
			
		}
		catch(Exception e)
		{


	        WebElement selectpermit = (WebElement) driver.findElementByAccessibilityId("arrow dropright-circle-outline");
			selectpermit.click();
			
			IOSElement PermitDetails = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("PERMIT DETAILS")));

	        String PermitDetailsAssert = PermitDetails.getText();
	        Assert.assertEquals(PermitDetailsAssert, "PERMIT DETAILS");
	        System.out.println("PERMIT DETAILS Assert working");
			
			WebElement enterResult1 = (WebElement) driver.findElementByAccessibilityId("Enter Result");
			enterResult1.click();		
			
			WebElement userComment11 = driver.findElementsByName("commentBoxTitle").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			userComment11.clear();
			userComment11.sendKeys("Test");
			
			WebElement arrow1Dropdown = (WebElement) driver.findElementByAccessibilityId("arrow dropdown");
			arrow1Dropdown.click();
			
			WebElement arrow1Up1 = (WebElement) driver.findElementByAccessibilityId("arrow up");
			arrow1Up1.click();
			
			WebElement set1Value1 = (WebElement) driver.findElementByAccessibilityId("Set");
			set1Value1.click();
			
		    WebElement resultCode = (WebElement) driver.findElementByAccessibilityId("Result code");
			resultCode.click();
			
			WebElement pass = (WebElement) driver.findElementByAccessibilityId("Communication");
			pass.click();
			
			WebElement selectOK = (WebElement) driver.findElementByAccessibilityId("OK");
			selectOK.click();
			
			WebElement permitSubmit = (WebElement) driver.findElementByAccessibilityId("Re-Save Draft");
			permitSubmit.click();
			
			IOSElement alertTitlElent1 = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Report saved as Draft")));
			String aTitle = alertTitlElent1.getText();
	        Assert.assertEquals(aTitle, "Report saved as Draft");
	        IOSElement oKBTElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        oKBTElement.click();
			
			
			System.out.println("Permit Saved into Draft Assertion Working");
	        
	        WebElement myPermits = (WebElement) driver.findElementByAccessibilityId("Saved Drafts");
			myPermits.click();
			
			WebElement ClickMyPermit = (WebElement) driver.findElementByAccessibilityId("arrow dropright-circle-outline");
			ClickMyPermit.click();
	        
	        WebElement EnterResultPage = (WebElement) driver.findElementByAccessibilityId("Enter Result");
	        EnterResultPage.click();		
			
	        WebElement CommentAdded = driver.findElementsByName("commentBoxTitle").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			userComment11.clear();
			CommentAdded.sendKeys("Test");
			
			WebElement arrowDropdown = (WebElement) driver.findElementByAccessibilityId("arrow dropdown");
			arrowDropdown.click();
			
			WebElement arrowUp1 = (WebElement) driver.findElementByAccessibilityId("arrow up");
			arrowUp1.click();
			
			WebElement setValue1 = (WebElement) driver.findElementByAccessibilityId("Set");
			setValue1.click();
			
		    WebElement resltCode = (WebElement) driver.findElementByAccessibilityId("Result code");
		    resltCode.click();
			
			WebElement DropDownSelect = (WebElement) driver.findElementByAccessibilityId("Communication");
			DropDownSelect.click();
			
			WebElement select = (WebElement) driver.findElementByAccessibilityId("OK");
			select.click();
			
			WebElement permtSubmit = (WebElement) driver.findElementByAccessibilityId("Submit Now");
			permtSubmit.click();
			
			WebElement submtPermit = (WebElement) driver.findElementByAccessibilityId("OK");
			submtPermit.click();
			
			IOSElement alertTtlElent1 = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Your Report is added to the pending submission list and will be submitted shortly.")));
			String alertTitle = alertTtlElent1.getText();
	        Assert.assertEquals(aTitle, "Your Report is added to the pending submission list and will be submitted shortly.");
	        IOSElement ooKBTElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        ooKBTElement.click();
			
	        System.out.println(" Successfully Submit Permits from Saved Draft And Assert working");
			
			
		}

		
		
		
		
    
  }
}
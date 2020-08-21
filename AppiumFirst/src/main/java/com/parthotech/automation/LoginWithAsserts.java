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

public class LoginWithAsserts {

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
		
		WebElement webUserName = driver.findElementsByName("Username").get(1);
		
        
        
		if (webUserName.getAttribute("value") != null)
			
		{
			
//			
//			// ##############################    Login in Offline          ###########################################
//
//			
//			WebElement webUserNameEnter = driver.findElementsByName("Username").get(1);
//			webUserNameEnter.clear();
//			webUserNameEnter.sendKeys("psejwani");
//			assertEquals(webUserNameEnter.getAttribute("value"), "psejwani");
//			WebElement Passvalid = driver.findElementsByName("Password").get(1);
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			Passvalid.clear();
//			Passvalid.sendKeys("P@rth0tech!!");
//			WebElement loginButtonclk= (WebElement) driver.findElementByAccessibilityId("Login");
//			loginButtonclk.click();
//			IOSElement alertTitleElement1 = (IOSElement) new WebDriverWait(driver, 30)
//	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("You are not connected to the internet. Logging in using local credentials")));
//			String alertTitle = alertTitleElement1.getText();
//	        Assert.assertEquals(alertTitle, "You are not connected to the internet. Logging in using local credentials");
//	        IOSElement okButtonElement = (IOSElement) new WebDriverWait(driver, 30)
//	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
//	        okButtonElement.click();
//			WebElement myPermits = (WebElement) driver.findElementByAccessibilityId("menu");
//			myPermits.click();
//			WebElement myPermits1 = (WebElement) driver.findElementByAccessibilityId("Logout");
//			myPermits1.click();
//			System.out.println("Login in Offline");
//			
	
					
			
	// ##############################    Password Not Entered          ###########################################
//
//			
//			WebElement webUserName1 = driver.findElementsByName("Username").get(1);
			//assertEquals(webUserName1.getAttribute("value"), "psejwani");
			WebElement logButtonclk= (WebElement) driver.findElementByAccessibilityId("Login");
			logButtonclk.click();
			IOSElement alertTitlElent1 = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Please enter your password")));
			String aTitle = alertTitlElent1.getText();
	        Assert.assertEquals(aTitle, "Please enter your password");
	        IOSElement oKBTElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        oKBTElement.click();
			System.out.println("Password Not Entered");
			
	// ################################           Username Not Entered            ##########################################
		          
		    WebElement webUsrName = driver.findElementsByName("Username").get(1);
		    webUsrName.clear();
		    WebElement PassVValid = driver.findElementsByName("Password").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			PassVValid.clear();
			WebElement clicklogin= (WebElement) driver.findElementByAccessibilityId("Login");
			IOSElement titlecheck = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Please enter your username")));
			String altclick = titlecheck.getText();
	        Assert.assertEquals(altclick, "Please enter your username");
	        IOSElement okBttnElt = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        okBttnElt.click();
			System.out.println("Username Not Entered");


		// ###############################           Invalid Password Assert               #########################################
	        
	       
	         WebElement webUrNam1e = driver.findElementsByName("Username").get(1);
			assertNotNull(webUrNam1e);
			webUrNam1e.clear();
			webUrNam1e.sendKeys("psejwani");
			assertEquals(webUrNam1e.getAttribute("value"), "psejwani");
			
			 WebElement webUrPasswords = driver.findElementsByName("Password").get(1);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				webUrPasswords.sendKeys("P@rth0tech!");
			
			
			WebElement lgnbck= (WebElement) driver.findElementByAccessibilityId("Login");
			lgnbck.click();
			
	        IOSElement alertTitleElt1 = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Incorrect username or password is entered. Please try again")));

	        String atle = alertTitleElt1.getText();
	        Assert.assertEquals(atle, "Incorrect username or password is entered. Please try again");

	        IOSElement okBtnElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        okBtnElement.click();
			
		    System.out.println("Invalid Password Assert");

			
		
	// ############################           Username N Password Not Entered            ######################################
		          
		    
		    WebElement UserNameNotEnter = driver.findElementsByName("Username").get(1);
		    UserNameNotEnter.clear();
		    
		    
		    
			WebElement PassNotEnter = driver.findElementsByName("Password").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			PassNotEnter.clear();
			//Passvalid.sendKeys("P@rth0tech!!");
			
			
			WebElement LoginButtonClick= (WebElement) driver.findElementByAccessibilityId("Login");
			LoginButtonClick.click();
			
	        IOSElement TitleCheckVerify = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Please enter your username and password")));

	        String AlterVerify = TitleCheckVerify.getText();
	        Assert.assertEquals(AlterVerify, "Please enter your username and password");

	        IOSElement OkButton = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        OkButton.click();
			
		   
		    System.out.println("Username and Password Not Entered");

	// ############################       Enter Valid Username and Password            ######################################
		          
		    
		    WebElement entervalidUN = driver.findElementsByName("Username").get(1);
		    entervalidUN.clear();
		    entervalidUN.sendKeys("psejwani");
		    
			WebElement validpassenter = driver.findElementsByName("Password").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			validpassenter.sendKeys("P@rth0tech!!");
			
			
			WebElement LoginButtonClik= (WebElement) driver.findElementByAccessibilityId("Login");
			LoginButtonClik.click();
			
			Assert.assertEquals(driver.findElementByAccessibilityId("2").getText(), "2");
			
			
			WebElement myPermitsA = (WebElement) driver.findElementByAccessibilityId("menu");
			myPermitsA.click();
			
			WebElement myPermitsAT = (WebElement) driver.findElementByAccessibilityId("Logout");
			myPermitsAT.click();
			Assert.assertEquals(driver.findElementByName("2").getText(), "2");
			
			System.out.println("Login with valid crendential");
		}	
		
		else 
		{ 
		
			// ##############################    Password Not Entered          ###########################################

			
			WebElement webUserName2 = driver.findElementsByName("Username").get(1);
			webUserName2.sendKeys("psejwani");
			assertEquals(webUserName2.getAttribute("value"), "psejwani");
			
			
			WebElement loginButtonclk= (WebElement) driver.findElementByAccessibilityId("Login");
			loginButtonclk.click();
			
	        IOSElement alertTitleElement1 = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Please enter your password")));

	        String alertTitle = alertTitleElement1.getText();
	        Assert.assertEquals(alertTitle, "Please enter your password");

	        IOSElement okButtonElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        okButtonElement.click();
			System.out.println("Password Not Entered");
						
				// ################################           Username Not Entered            ##########################################
					          
		    
		    WebElement webUsrName = driver.findElementsByName("Username").get(1);
		    webUsrName.clear();
		    
		    WebElement Passvalid = driver.findElementsByName("Password").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Passvalid.clear();
			Passvalid.sendKeys("P@rth0tech!!");
			
			
			WebElement clicklogin= (WebElement) driver.findElementByAccessibilityId("Login");
			clicklogin.click();
			
	        IOSElement titlecheck = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Please enter your username")));

	        String altclick = titlecheck.getText();
	        Assert.assertEquals(altclick, "Please enter your username");

	        IOSElement okBttnElt = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        okBttnElt.click();
			
		   
		    System.out.println("Username Not Entered");

						

					// ###############################           Invalid Password Assert               #########################################
				        
				       
	        WebElement webUrName = driver.findElementsByName("Username").get(1);
			assertNotNull(webUrName);
			webUrName.sendKeys("psejwani");
			assertEquals(webUrName.getAttribute("value"), "psejwani");
			
			WebElement webUrPasswords = driver.findElementsByName("Password").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			webUrPasswords.sendKeys("P@rth0tech!");
			
			
			WebElement lgnbck= (WebElement) driver.findElementByAccessibilityId("Login");
			lgnbck.click();
			
	        IOSElement alertTitleElt1 = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Incorrect username or password is entered. Please try again")));

	        String atle = alertTitleElt1.getText();
	        Assert.assertEquals(atle, "Incorrect username or password is entered. Please try again");

	        IOSElement okBtnElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        okBtnElement.click();
			
		    System.out.println("Invalid Password Assert");

						
					 // ############################          Invalid Username Assert             ##########################################
					          
					    
		    WebElement wbUrName = driver.findElementsByName("Username").get(1);
		    wbUrName.clear();
		    wbUrName.sendKeys("pii");
		    
		    
			WebElement wbUrPasswords = driver.findElementsByName("Password").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			wbUrPasswords.clear();
			wbUrPasswords.sendKeys("P@rth0tech!!");
			
			
			WebElement lgnck= (WebElement) driver.findElementByAccessibilityId("Login");
			lgnck.click();
			
	        IOSElement altTitleElt1 = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Incorrect username or password is entered. Please try again")));

	        String alertclick = altTitleElt1.getText();
	        Assert.assertEquals(alertclick, "Incorrect username or password is entered. Please try again");

	        IOSElement okBElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        okBElement.click();
			
		   
		    System.out.println("Invalid Username Assert");

				// ############################           Username N Password Not Entered            ######################################
					          
					    
		    WebElement UserNameNotEnter = driver.findElementsByName("Username").get(1);
		    UserNameNotEnter.clear();
		    
		    
		    
			WebElement PassNotEnter = driver.findElementsByName("Password").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			PassNotEnter.clear();
			//Passvalid.sendKeys("P@rth0tech!!");
			
			
			WebElement LoginButtonClick= (WebElement) driver.findElementByAccessibilityId("Login");
			LoginButtonClick.click();
			
	        IOSElement TitleCheckVerify = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Please enter your username and password")));

	        String AlterVerify = TitleCheckVerify.getText();
	        Assert.assertEquals(AlterVerify, "Please enter your username and password");

	        IOSElement OkButton = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        OkButton.click();
			
		   
		    System.out.println("Username and Password Not Entered");

				// ############################       Enter Valid Username and Password            ######################################
					          
					    
		    WebElement entervalidUN = driver.findElementsByName("Username").get(1);
		    entervalidUN.clear();
		    entervalidUN.sendKeys("psejwani");
		    
			WebElement validpassenter = driver.findElementsByName("Password").get(1);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			validpassenter.sendKeys("P@rth0tech!!");
			
			
			WebElement LoginButtonClik= (WebElement) driver.findElementByAccessibilityId("Login");
			LoginButtonClik.click();
			
			Assert.assertEquals(driver.findElementByAccessibilityId("2").getText(), "2");
			
			
			WebElement myPermits = (WebElement) driver.findElementByAccessibilityId("menu");
			myPermits.click();
			
			WebElement myPermits1 = (WebElement) driver.findElementByAccessibilityId("Logout");
			myPermits1.click();
			Assert.assertEquals(driver.findElementByName("2").getText(), "2");
			
			System.out.println("Login with valid crendential");
		
		
		}
  }
}
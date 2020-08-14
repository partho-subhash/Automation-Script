import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;

public class AppiumMyFirst {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		firstPro();

	}
	
	public static void firstPro() throws MalformedURLException {
		
		DesiredCapabilities cap = new DesiredCapabilities();
		
		  cap.setCapability("platformName", "iOS");
		  cap.setCapability("deviceName", "iPhone 11");
		  cap.setCapability("platformVersion", "13.5");
		  //cap.setCapability(CapabilityType.BROWSER_NAME, "safari");
		  cap.setCapability("app",
				  "/Users/subhash/Library/Developer/Xcode/DerivedData/MOBIINSPECT-awgqiirvazwfohftmbchrjryjhlw/Build/Products/Debug-iphonesimulator/MOBIINSPECT.app");
		  
		  URL url = new URL("http://127.0.0.1:4723/wd/hub");
		  
		 // IOSDriver driver = new IOSDriver(url, cap);
		  AppiumDriver driver = new AppiumDriver(url, cap);
		  
		 
		  
		// assuming we have a set of capabilities
		  //driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

		  Set<String> contextNames = driver.getContextHandles();
		  for (String contextName : contextNames) {
		      System.out.println(contextName); //prints out something like NATIVE_APP \n WEBVIEW_1
		  }
		  driver.context(contextNames.toArray()[0].toString());
		 
		  //do some web testing
		  //String myText = driver.findElement(By.cssSelector(".green_button")).click();

		 // driver.context("NATIVE_APP");

		  // do more native testing if we want

		  driver.quit();

		
	}

}

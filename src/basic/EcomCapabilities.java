package basic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class EcomCapabilities{

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		//App Location
		File src = new File("src");
		File storeLoc = new File(src,"1.1 General-Store.apk");
		
		//DesiredCapabilities
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.APP,storeLoc.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidDemo1");
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UIAutomator2");
		
		//Android driver 
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		return driver;
		
	}

}

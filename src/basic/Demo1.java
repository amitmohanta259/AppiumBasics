package basic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Demo1 {

	public static AndroidDriver<AndroidElement> capanilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		/*Desired capabilities
			--->Launch the emulator
			--->launch the app
				--> for the first time install the app
			--->Talk to appium server or Connect to appium server
			
			--->Automation Code
		*/
		
		File src= new File("src");
		File appSrc = new File(src,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "AndroidDemo1");
		cap.setCapability(MobileCapabilityType.APP, appSrc.getAbsolutePath());
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
		cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "0");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		return driver;
		/*
		 * Connection and Session close in 60 sec by default
		 * And if if dont want to wait for 60sec the u can "close the connection and the start it again" 
		 * */
	}

}

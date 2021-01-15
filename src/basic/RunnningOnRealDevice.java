package basic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class RunnningOnRealDevice {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		File src = new File("src");
		File appsrc = new File(src,"ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.APP, appsrc.getAbsolutePath());
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
	}
}

package basic;

import java.io.File;
import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.bys.ContentType;
import io.appium.java_client.remote.MobileCapabilityType;

public class KeyEvents extends Demo1{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capanilities();
		//current activity
		System.out.println("current activity="+driver.currentActivity());
		
		//getContext
		System.out.println("get context="+driver.getContext());
		
		//get current package
		System.out.println("get current page="+driver.getCurrentPackage());
		
		//clipboard text
		System.out.println("clipboard text="+driver.getClipboardText());
		
		System.out.println("Orientation="+driver.getOrientation());
		
		System.out.println("Keyboard locked="+driver.isDeviceLocked());

		System.out.println("get platform name="+driver.getPlatformName());
		
		System.out.println("getRemoteAddress"+driver.getRemoteAddress());
		
		driver.lockDevice(Duration.ofSeconds(5));
	}

}

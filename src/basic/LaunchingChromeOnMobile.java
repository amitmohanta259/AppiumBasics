package basic;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LaunchingChromeOnMobile extends MobileBrowserChrome{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = mobileCapabilities();
		driver.get("http://google.com");
	}

}

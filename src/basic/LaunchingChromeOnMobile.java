package basic;

import java.net.MalformedURLException;

import org.openqa.selenium.Keys;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class LaunchingChromeOnMobile extends MobileBrowserChrome{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = mobileCapabilities();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElementByXPath("//input[@id='txtUsername']").sendKeys("Admin");
		driver.findElementByXPath("//input[@id='txtPassword']").sendKeys("admin123");
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
	}

}

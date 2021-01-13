package basic;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.GsmSignalStrength;

public class AndroidUIAutomatorDEMO extends Demo1{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capanilities();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		driver.findElementByAndroidUIAutomator("text(\"3D Transition\")").click();
		//driver.findElementByAndroidUIAutomator("text(\"3D Transition\")").click();
		System.out.println(driver.getContext());
		System.out.println(driver.currentActivity());
		System.out.println(driver.isBrowser());

	}

}

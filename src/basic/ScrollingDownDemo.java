package basic;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.net.MalformedURLException;

import javax.swing.Scrollable;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;

public class ScrollingDownDemo extends Demo1{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement>driver = capanilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		//AndroidTouchAction ata = new AndroidTouchAction(driver);
		//driver.findElementByAndroidUIAutomator("new UiScrollable(new UISelector()).scrollIntoView(text(\"Lists\"))");
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lists\"));");
	}

}

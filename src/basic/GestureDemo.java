package basic;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;

public class GestureDemo extends Demo1 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capanilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//TouchAction Example
		TouchAction tapAct = new TouchAction(driver);
		AndroidElement tapElement = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");
		tapAct.tap(tapOptions().withElement(element(tapElement))).perform();
		
		//AndroidTouchAction Example
		AndroidTouchAction ata = new AndroidTouchAction(driver);
		AndroidElement tapElement2 = driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']");
		ata.tap(tapOptions().withElement(element(tapElement2))).perform();
		
		AndroidElement tapElement3 = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		//ata.tap(tapOptions().withElement(element(tapElement3))).perform();
		//ata.longPress(LongPressOptions.longPressOptions().withElement(element(tapElement3)).withDuration(Duration.ofSeconds(4))).release();
		ata.longPress(LongPressOptions.longPressOptions().withElement(element(tapElement3)).withDuration(Duration.ofSeconds(2))).release().perform();
		
		System.out.println(driver.findElementById("android:id/title").isDisplayed());
		List<AndroidElement> elements = driver.findElementsById("android:id/title");
		for (AndroidElement androidElement : elements) {
			System.out.println(androidElement.getText());
		}
 		System.out.println(driver.findElementById("android:id/title").getText());
		
		

	}

}

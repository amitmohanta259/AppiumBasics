package basic;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class SwippingDemo extends Demo1{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement>driver = capanilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
		List<AndroidElement> menu = driver.findElementsByXPath("//android.widget.TextView");
		for (AndroidElement androidElement : menu) {
			System.out.println(androidElement.getText());
		}
		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
		
		// Working with the clock
		driver.findElementByXPath("//*[@content-desc='10']").click();
		
		//Swapping Event
		
		AndroidElement defaultElement = driver.findElementByXPath("//*[@content-desc='15']");
		AndroidElement destinationElement = driver.findElementByXPath("//*[@content-desc='45']");
		
		TouchAction t = new TouchAction(driver);
		t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(defaultElement)).withDuration(Duration.ofSeconds(2))).moveTo(ElementOption.element(destinationElement)).release().perform();
		
		
		
	}

}

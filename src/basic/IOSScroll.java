package basic;

import java.net.MalformedURLException;
import java.time.Duration;
import org.openqa.selenium.Dimension;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class IOSScroll extends IOSCapabilities{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		IOSDriver<IOSElement>driver = capabilities();
		driver.findElementByAccessibilityId("Alert Views").click();
		driver.findElementByXPath("//*[@value='Text Entry']").click();
		driver.findElementByClassName("XCUIElementTypeTextField").sendKeys("hello");
		driver.findElementByName("OK").click();
		
		//go back
		driver.navigate().back();
		
		//Scroll operation
		TouchAction act = new TouchAction(driver);
		Dimension size = driver.manage().window().getSize();
		int x = size.getWidth()/2;
		int starty = (int)(size.getHeight()*0.6);
		int endy =(int)(size.getHeight()*0.10);
		act.press(PointOption.point(x,starty))
			.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
			.moveTo(PointOption.point(x, endy))
			.release().perform();
		
		//click on the element
		driver.findElement(MobileBy.AccessibilityId("Steppers")).click();
	}

}

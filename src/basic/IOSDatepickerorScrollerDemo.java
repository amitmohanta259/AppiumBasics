package basic;

import java.net.MalformedURLException;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class IOSDatepickerorScrollerDemo extends IOSCapabilities{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		IOSDriver<IOSElement> driver = capabilities();
		driver.findElementByAccessibilityId("Picker View").click();
		driver.findElementByClassName("Col1_date").sendKeys("20");
		driver.findElementByClassName("Col2_month").sendKeys("2");
		driver.findElementByClassName("Col3_year").sendKeys("2000");
	}

}

package basic;

import java.net.MalformedURLException;
import org.openqa.selenium.JavascriptExecutor;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CricbuzzDemo extends MobileBrowserChrome{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = mobileCapabilities();
		driver.get("https://m.cricbuzz.com/");
		driver.findElementByXPath("//*[@class='ui-btn-text']").click();
		driver.findElementByXPath("//*[text()='Home']").click();
		Thread.sleep(5000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		
		//Assert.assertTrue();
		org.testng.Assert.assertTrue(driver.findElementByXPath("//h4[text()='Top Stories']").getAttribute("class").contains("ui-header"));
		System.out.println("Successfully conducted");
	}

}

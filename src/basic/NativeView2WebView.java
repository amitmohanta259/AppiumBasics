package basic;

import java.net.MalformedURLException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class NativeView2WebView extends EcomCapabilities{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver= capabilities();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		driver.hideKeyboard();
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));");
		// driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new
		// UiSelector().scrollable(true).instance(0)).scrollIntoView(new
		// UiSelector().textMatches(\"" + containedText + "\").instance(0))"));
		driver.findElement(By.xpath("//*[@text='Argentina']")).click();
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		// select multiple product
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();
		driver.findElements(By.xpath("//*[@text='ADD TO CART']")).get(0).click();

		// click on cart
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		Thread.sleep(4000);
		
		//Select checkbox and click on complete purchase
		AndroidElement checkbox = driver.findElement(By.className("android.widget.CheckBox"));
		TouchAction touch = new TouchAction(driver);
		touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(checkbox)));
		driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
		/* 
		 * this wait is for loading into webview
		 * if webview is not loaded then there might be error or exceptions 
		 */
		Thread.sleep(5000); 
		//Switch from native app view to webView
		Set<String> context = driver.getContextHandles();
		
		//printing out the views or app context weather native app or hybrid app or webview
		for(String contexts : context){
			System.out.println(contexts);
		}
		
		driver.context("WEBVIEW_com.androidsample.generalstor");
		driver.findElement(By.name("q")).sendKeys("Hello");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
		//MOve back using android back button
		driver.pressKey(new KeyEvent(AndroidKey.BACK));

		
	}

}

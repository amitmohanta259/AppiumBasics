package basic;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.sun.xml.internal.bind.v2.model.core.ID;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ScrollToPro_Add extends EcomCapabilities {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Hello");
		// Hiding the keyboard
		driver.hideKeyboard();
		// CheckBox
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		// DropDown 1.click 2.scrolltoView 3click
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(
				MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(Text(\"India\"))"));
		/*
		 * driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new
		 * UiSelector().scrollable(true).instance(0)).scrollIntoView(new
		 * UiSelector().textMatches(\"Jordan 6 Rings\").instance(0))"));
		 */
		driver.findElement(By.xpath("//*[@text='India']")).click();
		// Click on Lets shop
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();

		//Select Product & click on add to cart
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"com.androidsample.generalstore:id/rvProductList\")).scrollIntoView(new UiSelector().textMatches(\"Jordan 6 Rings\").instance(0));"));
		int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();
		for(int i=0;i<count;i++){
			String text = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();
			if(text.equalsIgnoreCase("Jordan 6 Rings")){
				driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				break;
			}
		}
		
		// click on the carts 
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		// Verify cart
		String cartProdDetails =    driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();
		Assert.assertEquals("Jordan 6 Rings", cartProdDetails);
	}

}

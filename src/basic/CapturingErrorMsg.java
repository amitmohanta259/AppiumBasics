package basic;

import java.net.MalformedURLException;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CapturingErrorMsg extends EcomCapabilities{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
		//Blank Check box
		//CheckBox
		driver.findElement(By.xpath("//*[@text='Female']")).click();
		//DropDown 1.click 2.scrolltoView 3click
		driver.findElement(By.id("android:id/text1")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView(text(\"India\")));"));
		driver.findElement(By.xpath("//*[@text='India']")).click();
		//Click on Lets shop
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click(); 
		
		//Capture error msg
		try {
			String toastMsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
			System.out.println(toastMsg);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("No error message");
		}
	}

}

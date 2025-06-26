package functionalTestcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class BrandPage extends BaseClass 
{
     @Test
	 public void homePage() throws InterruptedException
	 {
		 driver.findElement(By.xpath("//android.widget.Button/android.widget.ImageView")).click();
		 Thread.sleep(2000);
		 driver.pressKey(new KeyEvent(AndroidKey.BACK));
		 driver.findElement(By.xpath("//android.widget.TextView[@text='']")).click();
		 Thread.sleep(2000);
		 driver.pressKey(new KeyEvent(AndroidKey.BACK));
		 driver.findElement(AppiumBy.androidUIAutomator("new UiSelector().className(\"android.widget.ImageView\").instance(3)")).click();
		 Thread.sleep(2000);
		 driver.pressKey(new KeyEvent(AndroidKey.BACK));
		 
		 
	 }
}	


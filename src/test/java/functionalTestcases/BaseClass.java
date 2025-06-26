package functionalTestcases;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Service;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	
	public AndroidDriver driver ;
	public AppiumDriverLocalService service ;
	
	@BeforeClass
	public void appiumConfigration() throws MalformedURLException
	{
		
		 service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\T495\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1")
			    .usingPort(4723).build();
		service.start();
		// UI Automator Class for device and apk name
		UiAutomator2Options Options =  new UiAutomator2Options();
		Options.setDeviceName("Pixel 2 API 34");
		Options.setApp("D:\\Rest Assured\\GyftrAPKAppium\\src\\test\\java\\resources\\gyftr.apk");
		
		//  Driver calling  confrigration
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), Options);
		
	}
	@AfterClass
	public void tearDown() 
	{
		driver.quit();
		service.stop();
		
	}

	
}

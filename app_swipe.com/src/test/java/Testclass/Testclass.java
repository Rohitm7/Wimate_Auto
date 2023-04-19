package Testclass;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class Testclass {
	static AndroidDriver driver;
	@Test
	public void testcases() throws Exception{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("deviceName", "Samsung Testing Phone");
		cap.setCapability("udid", "10.0.1.130:5555");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");

	//	cap.setCapability("appPackage", "com.sec.android.gallery3d");
	//	cap.setCapability("appActivity", "com.samsung.android.gallary.app.activity.GalleryActivity");
		
	//	cap.setCapability("appPackage", "io.ionic.starter.untangled_ams_task");
	//	cap.setCapability("appActivity", "io.ionic.starter.untangled_ams_task.MainActivity");
		
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.gms.common.api.GoogleApiActivity");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AndroidDriver(url, cap);

		System.out.println("Application Launched");
		

		Thread.sleep(3000);
	}

}

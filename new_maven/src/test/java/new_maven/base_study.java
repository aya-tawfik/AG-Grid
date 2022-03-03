package new_maven;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base_study {

	// on REAL device
	public static AndroidDriver<AndroidElement> Capabilities_study() throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver;

		
	 File appDir = new File("src");
     File app = new File(appDir, "app-google-staging.apk");
     DesiredCapabilities capabilities = new DesiredCapabilities();
     capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "HUAWEI TRT-L21A");
     capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
    // capabilities.setCapability("browsername", "chrome");
    // capabilities.setCapability("appPackage", "com.android.chrome");
     //capabilities.setCapability("chromedriverExecutable", (appDir+ "\\chromedriver"));
    // capabilities.setCapability("appActivity", "com.google.android.apps.chrome.Main");
   driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
   return driver;

	}
	
	
	
}


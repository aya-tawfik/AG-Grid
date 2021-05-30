package new_maven;

import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomator extends base {

	public static void main(String[] args) throws MalformedURLException {
	
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();;
		System.out.print(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
	}

}

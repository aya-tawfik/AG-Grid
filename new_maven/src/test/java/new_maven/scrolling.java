package new_maven;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class scrolling extends base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		WebElement w= driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
		w.click();
	}

}

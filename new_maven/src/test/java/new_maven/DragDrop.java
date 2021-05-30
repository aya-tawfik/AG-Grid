package new_maven;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.ElementOption.element;

//import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class DragDrop extends base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = driver.findElementsByClassName("android.view.View").get(1);
		TouchAction t = new TouchAction(driver);
		t.longPress(element(source)).moveTo(element(destination)).release().perform();
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.BACK));
		((AndroidDriver) driver).pressKey(new KeyEvent(AndroidKey.HOME));
	}

}

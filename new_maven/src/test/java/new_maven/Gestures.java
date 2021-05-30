package new_maven;

import java.net.MalformedURLException;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class Gestures extends base {

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		/*WebElement Expand= driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
		TouchActions t = new TouchActions(driver).singleTap(Expand);
		t.perform();*/
		
		
		
		WebElement ele = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
		TouchAction action = new TouchAction(driver);
		action.tap(new TapOptions().withElement(new ElementOption().withElement(ele))).perform();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]").click();
		WebElement pn = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		action.longPress(longPressOptions().withElement(element(pn)).withDuration(ofSeconds(2))).release().perform();
		System.out.print(driver.findElementById("android:id/title").isDisplayed());
	}

}

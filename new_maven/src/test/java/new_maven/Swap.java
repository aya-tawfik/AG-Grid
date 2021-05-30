package new_maven;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Swap extends base{

	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver= Capabilities();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Date Widgets\"]").click();
		driver.findElementByXPath("//android.widget.TextView[@content-desc=\"2. Inline\"]").click();
		driver.findElementByXPath("//*[@content-desc='9']").click();
		WebElement first=driver.findElementByXPath("//*[@content-desc='15']");
		WebElement second=driver.findElementByXPath("//*[@content-desc='45']");
		TouchAction t=new TouchAction(driver);
		t.longPress(longPressOptions().withElement(element(first)).withDuration(ofSeconds(2))).moveTo(element(second)).release().perform();
	}

}

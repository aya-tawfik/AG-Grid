package new_maven;

import java.net.MalformedURLException;
import java.util.ArrayList;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.offset.ElementOption.element;

//import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class study_ws extends base_study{
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		AndroidDriver<AndroidElement> driver= Capabilities_study();
		ArrayList<String> contexts = new ArrayList(driver.getContextHandles());
        for (String context : contexts) {
            if (!context.equals("NATIVE_APP")) {
                System.out.print(context);
//                return context;
                }
            Thread.sleep(1000);
            
            driver.context(context);
          driver.get("https://cloudgrey.io");
            
            //driver.get("www.nagwa.com/");
        }

	}
	
/*	private String getWebContext(AppiumDriver driver) {
        ArrayList<String> contexts = new ArrayList(driver.getContextHandles());
        for (String context : contexts) {
            if (!context.equals("NATIVE_APP")) {
                return context;
            }
        }
        return null;
    }
*/


}

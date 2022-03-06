package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Page_Base {

    protected WebDriver driver;
    public static JavascriptExecutor jse;


    public Page_Base(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    public static void click(WebElement Element)
    {
        Element.click();
    }

    public static void enterText(WebElement element, String text)
    {
        element.sendKeys(text);
    }


    public static void zoomout()

    {
        jse.executeScript("document.body.style.zoom='60%'");
    }


    public static void scrollToView(WebElement element) {
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }
}

package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AG_Page extends Page_Base
{
    public AG_Page(WebDriver driver) {
        super(driver);
        jse= (JavascriptExecutor) driver;
    }
    @FindBy(xpath="/html/body/main/section/div/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[2]/div[3]/span/span")
    public WebElement language_menu;

    @FindBy(xpath = "/html/body/main/div[3]/div/div[1]/span[2]/span")
    public WebElement language_filter;

    @FindBy(xpath="//div//div//input[@class='ag-input-field-input ag-text-field-input']")
    public WebElement language_search;

    @FindBy(xpath="/html/body/main/section/div/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[2]")
    public WebElement language_cell;

    @FindBy(xpath = "//*[@aria-colindex='3' and @col-id='country' and @class='ag-header-cell ag-header-cell-sortable ag-focus-managed']//div[3]//span[@class='ag-header-icon ag-header-cell-menu-button']")
    public WebElement country_menu;

}

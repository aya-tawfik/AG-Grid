package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AG_Page extends Page_Base
{
    public AG_Page(WebDriver driver) {
        super(driver);
        jse= (JavascriptExecutor) driver;
    }

    @FindBy(xpath = " //span[@class='ag-icon ag-icon-menu']")
    public List<WebElement> menu_list;


    @FindBy(xpath="//*[@aria-label='filter']")
    public WebElement filterInMenu;


    @FindBy(xpath="//div//div//input[@class='ag-input-field-input ag-text-field-input']")
    public WebElement language_search;


    @FindBy(xpath="//*[@class='ag-cell-value ag-cell ag-cell-not-inline-editing ag-cell-normal-height vAlign']")
    public List<WebElement> language_cells;


    @FindBy(xpath="//input[@class='ag-input-field-input ag-text-field-input' and @aria-label='Search filter values']")
    public WebElement country_search;

    @FindBy(xpath = "//*[@class='ag-cell-value ag-cell ag-cell-not-inline-editing ag-cell-normal-height countryCell vAlign' and @aria-colindex='3' and @col-id='country']")
    public WebElement country_cell;

    @FindBy(id="onetrust-close-btn-container")
    public WebElement close_cookie;

   @FindBy(xpath= "//*[@aria-colindex='11' and @col-id='jan' and @role='gridcell']")
    public WebElement jan_value;


 //Method to get the value of jan month after applying search criteria
   public String getJanValue(String language, String country)
   {
       click(menu_list.get(1));
       click(filterInMenu);
       click(language_search);
       enterText(language_search,language);
       click(menu_list.get(2));
       enterText(country_search,country);
       country_search.sendKeys(Keys.RETURN);
       click(close_cookie);
       zoomout();
       String janValue=jan_value.getText();
       return janValue;

   }

}

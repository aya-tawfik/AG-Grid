package Tests;

import Pages.AG_Page;
import org.testng.Assert;
import org.testng.annotations.Test;

import static Pages.Page_Base.*;


public class AG_Test extends Test_Base

{
    AG_Page AG_object;
    @Test
    public void testcase1() throws InterruptedException {
        AG_object= new AG_Page(getDriver());
        click(AG_object.language_menu);
        click(AG_object.language_filter);
        click(AG_object.language_search);
        entertext(AG_object.language_search,"French");
        Thread.sleep(1000);
        Assert.assertEquals(AG_object.language_cell.getText(),"French");
        click(AG_object.country_menu);

    }
}

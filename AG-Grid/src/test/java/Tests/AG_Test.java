package Tests;

import Pages.AG_Page;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.excelUtilities;
import org.testng.asserts.SoftAssert;
import java.io.IOException;


public class AG_Test extends Test_Base

{
    AG_Page AG_object;
    String janValue= "$66,433";
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCase_1() throws IOException
    {
        excelUtilities ex= new excelUtilities();
        Object lang= ex.readData(1,"Language");
        Object country= ex.readData(1,"Country");
        AG_object= new AG_Page(getDriver());
        String returnedJanValue=AG_object.getJanValue(lang.toString(),country.toString());
        softAssert.assertEquals(returnedJanValue,janValue);
        softAssert.assertAll();
        Assert.assertEquals(AG_object.language_cells.get(0).getText(),lang);
        Assert.assertEquals(AG_object.country_cell.getText(),country);
        Assert.assertEquals(returnedJanValue,janValue);
    }
}

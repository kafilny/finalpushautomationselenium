package us;

import base.CommonAPI;
import cnnhomepage.CHomePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Uspage extends CommonAPI {
    public void usPageNews(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CHomePage chomePage = PageFactory.initElements(driver, CHomePage.class);
        chomePage.clickonus();
    }

}

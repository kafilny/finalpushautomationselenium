package ushomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by kafiluddin on 5/23/17.
 */
public class UsHomePage extends CommonAPI {
    @FindBy(how = How.CSS,using = ".nav-section .nav-section_name js-nav-section-name .nav-section_expand-icon svg:only-child")
    public static WebElement sectionUs;
    @FindBy(how = How.CSS,using = "#nav-section-submenu li:nth-child(1)")
    public static WebElement sectionCrimejustice;

    public static WebElement getSectionCrimejustice() {
        return sectionCrimejustice;
    }

    public static WebElement getSectionUs() {
        return sectionUs;
    }
    public void gotosectionUs(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionUs().click();
    }
    public void gotosectioncrimejustice(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionCrimejustice().click();
    }

}

package opinionpage;

import base.CommonAPI;
import cnnhomepage.CHomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

import static base.CommonAPI.driver;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class OpinionPage extends CommonAPI{
    public void opinionnewspage(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CHomePage chomepage= PageFactory.initElements(driver, CHomePage.class);
        chomepage.clickonopinion();
    }
}

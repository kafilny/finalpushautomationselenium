package techpage;

import base.CommonAPI;
import cnnhomepage.CHomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class TechPage extends CommonAPI {
    public void technewspage(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CHomePage chomepage= PageFactory.initElements(driver, CHomePage.class);
        chomepage.clickontech();
    }
}

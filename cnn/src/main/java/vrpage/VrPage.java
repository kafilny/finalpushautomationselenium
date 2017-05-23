package vrpage;

import base.CommonAPI;
import cnnhomepage.CHomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class VrPage extends CommonAPI {
    public void vrnewspage(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        CHomePage chomepage= PageFactory.initElements(driver, CHomePage.class);
        chomepage.clickonvr();
    }
}

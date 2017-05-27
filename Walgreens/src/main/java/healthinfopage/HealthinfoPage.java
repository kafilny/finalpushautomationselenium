package healthinfopage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;
import wghomepage.WgHomepage;

/**
 * Created by kafiluddin on 5/27/17.
 */
public class HealthinfoPage extends CommonAPI {
    public void healthinfopage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        WgHomepage wgHomepage = PageFactory.initElements(driver, WgHomepage.class);
        wgHomepage.clickonhealthinfoservice();
    }
}

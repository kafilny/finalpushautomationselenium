package presrefilpage;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;
import wghomepage.WgHomepage;

/**
 * Created by kafiluddin on 5/26/17.
 */
public class PresRefilPage extends CommonAPI {
    public void prescriptionrefilpage(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        WgHomepage wgHomepage= PageFactory.initElements(driver,WgHomepage.class);
        wgHomepage.clickonpresrefil();
    }
}

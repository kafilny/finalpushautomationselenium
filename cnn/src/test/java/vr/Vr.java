package vr;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;
import vrpage.VrPage;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Vr extends CommonAPI {
    @Test
    public void vrpagenews() {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-51 </a>");
        VrPage vrPage= PageFactory.initElements(driver,VrPage.class);
        vrPage.vrnewspage();
    }
}

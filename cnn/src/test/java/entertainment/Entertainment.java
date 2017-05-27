package entertainment;

import base.CommonAPI;
import entertainmentpage.EntertainmentPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Entertainment extends CommonAPI {
    @Test
    public void entertainmentpagenews() {
        ApplicationLog.epicLogger("Epic: cnn AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-41 </a>");
        EntertainmentPage entertainmentpage= PageFactory.initElements(driver,EntertainmentPage.class);
        entertainmentpage.entertainmentnewspage();
    }
}

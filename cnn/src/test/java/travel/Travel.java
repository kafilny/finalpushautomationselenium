package travel;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import travelpage.TravelPage;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Travel extends CommonAPI {
    @Test
    public void travelpagenews() {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        TravelPage travelPage= PageFactory.initElements(driver,TravelPage.class);
        travelPage.travelnewspage();
    }
}

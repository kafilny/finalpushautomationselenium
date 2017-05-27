package crimejustice;

import base.CommonAPI;
import crimejusticepage.CrimeJusticePage;
import entertainmentpage.EntertainmentPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/23/17.
 */
public class CrimeJustice extends CommonAPI {
    @Test
    public void crimejusticepagenews() {
        ApplicationLog.epicLogger("Epic: cnn AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-42 </a>");
        CrimeJusticePage crimeJusticePage= PageFactory.initElements(driver,CrimeJusticePage.class);
        crimeJusticePage.crimejusticenewspage();
    }
}

package sports;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import sportspage.SportsPage;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Sports extends CommonAPI {
    @Test
    public void sportspagenews() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        SportsPage sportsPage= PageFactory.initElements(driver,SportsPage.class);
        sportsPage.sportsnewspage();
        //Thread.sleep(2000);
        Thread.sleep(2000);
    }
}

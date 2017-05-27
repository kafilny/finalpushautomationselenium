package ushomepagetest;

import base.CommonAPI;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import us.Us;
import ushomepage.UsHomePage;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/23/17.
 */
public class UsHomePageTest extends CommonAPI {
    @Test
    public void  uspagetest(){
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Us us=PageFactory.initElements(driver,Us.class);
        us.usnewspage();
        UsHomePage usHomePage= PageFactory.initElements(driver,UsHomePage.class);
      // usHomePage.gotosectionUs();
       UsHomePage.getSectionCrimejustice().click();
    }
}

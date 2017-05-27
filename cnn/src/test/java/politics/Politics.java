package politics;

import base.CommonAPI;
import cnnhomepage.CHomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import politicspage.PoliticsPage;
import utility.reporting.ApplicationLog;
import utility.reporting.TestLogger;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Politics extends CommonAPI {
    @Test
    public void politic(){
        ApplicationLog.epicLogger("Epic: cnn AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-45 </a>");
        PoliticsPage politicspage=PageFactory.initElements(driver,PoliticsPage.class);
        politicspage.politicsnewspage();
    }
}

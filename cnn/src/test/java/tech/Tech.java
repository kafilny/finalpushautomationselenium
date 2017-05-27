package tech;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import techpage.TechPage;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Tech extends CommonAPI {
    @Test
    public void techpagenews() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: cnn AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-48 </a>");
        TechPage techPage= PageFactory.initElements(driver,TechPage.class);
        techPage.technewspage();
        Thread.sleep(2000);
    }
}

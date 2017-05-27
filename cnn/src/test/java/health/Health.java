package health;

import base.CommonAPI;
import healthpage.HealthPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Health extends CommonAPI {
    @Test
    public void healthpagenews() {
        ApplicationLog.epicLogger("Epic: cnn AC:1,2 <a https:https://peoplentch.atlassian.net/browse/GREEN-40 </a>");
        HealthPage healthPage= PageFactory.initElements(driver,HealthPage.class);
        healthPage.healthnewspage();

    }
}

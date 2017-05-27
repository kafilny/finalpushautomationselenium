package style;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import stylepage.StylePage;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Style extends CommonAPI {
    @Test
    public void stylepagenews() {
        ApplicationLog.epicLogger("Epic: cnn AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-47 </a>");
        StylePage stylePage= PageFactory.initElements(driver,StylePage.class);
        stylePage.stylenewspage();
    }
}

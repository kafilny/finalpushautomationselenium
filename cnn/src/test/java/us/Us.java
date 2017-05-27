package us;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Us extends CommonAPI {
    @Test
    public void usnewspage(){
        ApplicationLog.epicLogger("Epic: us AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-38 </a>");
        Uspage uspage = PageFactory.initElements(driver, Uspage.class);
        uspage.usPageNews();
    }
}

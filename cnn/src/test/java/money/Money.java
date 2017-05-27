package money;

import base.CommonAPI;
import moneypage.MoneyPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Money extends CommonAPI {
    @Test
    public void money() throws InterruptedException {
        ApplicationLog.epicLogger("Epic: cnn AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-43 </a>");
        MoneyPage moneypage= PageFactory.initElements(driver,MoneyPage.class);
        moneypage.moneynewspage();
        Thread.sleep(2000);
    }
}

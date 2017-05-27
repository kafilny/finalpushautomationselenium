package presrefil;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import presrefilpage.PresRefilPage;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/26/17.
 */
public class PresRefilTest extends CommonAPI {
    @Test
    public void Prescriptionrefiltest(){
        ApplicationLog.epicLogger("Epic: us AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-38 </a>");
        PresRefilPage presRefilPage= PageFactory.initElements(driver,PresRefilPage.class);
        presRefilPage.prescriptionrefilpage();
    }
}

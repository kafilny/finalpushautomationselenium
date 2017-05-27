package opinion;

import base.CommonAPI;
import opinionpage.OpinionPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Opinion extends CommonAPI {
    @Test
    public void opinion(){
        ApplicationLog.epicLogger("Epic: cnn AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-44 </a>");
        OpinionPage opinionpage= PageFactory.initElements(driver,OpinionPage.class);
        opinionpage.opinionnewspage();
    }
}

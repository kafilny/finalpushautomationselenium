package video;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;
import videopage.VideoPage;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class Video extends CommonAPI {
    @Test
    public void videopagenews() {
        ApplicationLog.epicLogger("Epic: Metro AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        VideoPage videoPage= PageFactory.initElements(driver,VideoPage.class);
        videoPage.videonewspage();
    }
}

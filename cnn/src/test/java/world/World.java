package world;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;
import worldpage.WorldPage;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class World extends CommonAPI {
             @Test
                     public void worldpagenews() {
                 ApplicationLog.epicLogger("Epic: cnn AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-39 </a>");
                 WorldPage worldPage= PageFactory.initElements(driver,WorldPage.class);
                 worldPage.worldnewspage();
             }
             }

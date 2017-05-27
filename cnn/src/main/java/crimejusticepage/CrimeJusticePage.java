package crimejusticepage;

import base.CommonAPI;
import cnnhomepage.CHomePage;
import org.openqa.selenium.support.PageFactory;
import utility.reporting.TestLogger;

/**
 * Created by kafiluddin on 5/23/17.
 */
public class CrimeJusticePage extends CommonAPI {
    public void crimejusticenewspage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        CHomePage chomepage = PageFactory.initElements(driver, CHomePage.class);
        chomepage.clickonCrimejustice();
    }
}

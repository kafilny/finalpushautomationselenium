package ebaysignin;

import base.CommonAPI;
import utility.reporting.TestLogger;

/**
 * Created by kafiluddin on 5/19/17.
 */
public class SigninPage extends CommonAPI {
    public void clickonsigninpage() {
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
    }
}

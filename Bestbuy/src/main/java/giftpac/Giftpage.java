package giftpac;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by kafiluddin on 5/16/17.
 */
public class Giftpage extends CommonAPI {
   // @FindBy(how = How.XPATH, using = ".//*[@id='group0']/div[1]/div[1]/ul/li[1]/a")
    public static WebElement giftheader;
    public void clickonGiftideas(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
    }
}

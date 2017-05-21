package giftideas;

import base.CommonAPI;
import giftpac.Giftpage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/16/17.
 */
public class GiftIdeaspage extends CommonAPI{
    @Test
    public void url(){
        ApplicationLog.epicLogger("Epic: urlpage AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Giftpage Giftpage= PageFactory.initElements(driver, Giftpage.class);
        Giftpage.clickonGiftideas();
       driver.findElement(By.xpath(".//*[@id='menu0']")).click();
    }
    @Test
    public void clickonproducts(){
        ApplicationLog.epicLogger("Epic: productpage AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-7> GREEN-7 </a>");
        Giftpage Giftpage= PageFactory.initElements(driver, Giftpage.class);
        Giftpage.clickonGiftideas();

    }

}

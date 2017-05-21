package dailydeal;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/17/17.
 */
public class Dailydil extends CommonAPI {

    @Test
    public void dealoftheday(){
        driver.findElement(By.xpath(".//*[@id='gh-p-1']/a")).click();
        ApplicationLog.epicLogger("Epic: dailydeal AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-35 </a>");
        Dailydealpage dailydealpage= PageFactory.initElements(driver,Dailydealpage.class);
        dailydealpage.clickondailydeal();

    }
    @Test
    public void Giftcards(){
        driver.findElement(By.xpath(".//*[@id='gh-p-4']/a")).click();
        ApplicationLog.epicLogger("Epic: Giftcards AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-35 </a>");
        Dailydealpage dailydealpage= PageFactory.initElements(driver,Dailydealpage.class);
        dailydealpage.clickondailydeal();
    }
    @Test
    public void helpandcontact(){
        driver.findElement(By.xpath(".//*[@id='gh-p-3']/a")).click();
        ApplicationLog.epicLogger("Epic: helpandcontactpage AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-35 </a>");
        Dailydealpage dailydealpage= PageFactory.initElements(driver,Dailydealpage.class);
        dailydealpage.clickondailydeal();
    }

    }


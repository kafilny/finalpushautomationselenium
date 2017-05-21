package signin_and_registrar;

import base.CommonAPI;
import ebaysignin.SigninPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import utility.reporting.ApplicationLog;

/**
 * Created by kafiluddin on 5/19/17.
 */
public class SignIn extends CommonAPI {
    @Test
    public void gotosignin(){
        driver.findElement(By.xpath(".//*[@id='gh-ug']/a")).click();
        //driver.findElement(( By.xpath(".//*[@id='1431903178']");

        driver.findElement(By.cssSelector("")).sendKeys("");
        driver.findElement(By.cssSelector("")).sendKeys("");
        ApplicationLog.epicLogger("Epic: Signinpage AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-35 </a>");
        SigninPage SigninPage= PageFactory.initElements(driver, ebaysignin.SigninPage.class);
        SigninPage.clickonsigninpage();
    }
}

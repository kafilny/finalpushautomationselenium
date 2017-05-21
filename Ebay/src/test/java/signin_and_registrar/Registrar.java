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
public class Registrar extends CommonAPI {
    @Test
    public void Registrarpage(){
        driver.findElement(By.xpath(".//*[@id='gh-ug-flex']/a")).click();
        driver.findElement(By.cssSelector("#firstname")).sendKeys("kafil");
        driver.findElement(By.cssSelector("#lastname")).sendKeys("udd");
        driver.findElement(By.cssSelector("#suggestion")).sendKeys("udd@gmail.com");
        driver.findElement(By.cssSelector("#PASSWORD")).sendKeys("udd");
        driver.findElement(By.xpath("#ppaFormSbtBtn")).click();
        ApplicationLog.epicLogger("Epic: registrar AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-35 </a>");
        ebaysignin.SigninPage SigninPage= PageFactory.initElements(driver, ebaysignin.SigninPage.class);
        SigninPage.clickonsigninpage();
}
}

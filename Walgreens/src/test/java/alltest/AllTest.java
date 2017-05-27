package alltest;

import balancerewardpage.BalanceRewardPage;
import base.CommonAPI;
import contactlensepage.ContactLensepage;
import healthcareclinicpage.HealthCareClinicPage;
import healthinfopage.HealthinfoPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import photopage.PhotoPage;
import shopproductspage.ShopProductsPage;
import utility.reporting.ApplicationLog;
import weeklyadcouponpage.WeeklyCouponPage;

/**
 * Created by kafiluddin on 5/27/17.
 */
public class AllTest extends CommonAPI{
    //@Test
    public void healthinfotest(){
        ApplicationLog.epicLogger("Epic: us AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-38 </a>");
        HealthinfoPage healthinfoPage= PageFactory.initElements(driver,HealthinfoPage.class);
       healthinfoPage.healthinfopage();
    }
    //@Test
    public void contactlensetest(){
        ApplicationLog.epicLogger("Epic: us AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-38 </a>");
        ContactLensepage contactLensepage= PageFactory.initElements(driver,ContactLensepage.class);
       contactLensepage.contactlensepage();
    }
    //@Test
    public void shopproductstest(){
        ApplicationLog.epicLogger("Epic: us AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-38 </a>");
       ShopProductsPage shopProductsPage= PageFactory.initElements(driver,ShopProductsPage.class);
        shopProductsPage.shopproductspage();
    }
    //@Test
    public void phototest(){
        ApplicationLog.epicLogger("Epic: us AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-38 </a>");
        PhotoPage photoPage= PageFactory.initElements(driver,PhotoPage.class);
        photoPage.photopage();
    }
    @Test
    public void weeklycoupontest(){
        ApplicationLog.epicLogger("Epic: us AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-38 </a>");
        WeeklyCouponPage weeklyCouponPage= PageFactory.initElements(driver,WeeklyCouponPage.class);
        weeklyCouponPage.weeklycouponpage();
    }
    @Test
    public void healtcareclinictest(){
        ApplicationLog.epicLogger("Epic: us AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-38 </a>");
        HealthCareClinicPage healthCareClinicPage= PageFactory.initElements(driver,HealthCareClinicPage.class);
        healthCareClinicPage.healthcareclinicpage();
    }
    @Test
    public void balancerewardtest(){
        ApplicationLog.epicLogger("Epic: us AC:1,2 <a https://peoplentch.atlassian.net/browse/GREEN-38 </a>");
        BalanceRewardPage balanceRewardPage= PageFactory.initElements(driver,BalanceRewardPage.class);
        balanceRewardPage.balancerewardpage();
    }
}

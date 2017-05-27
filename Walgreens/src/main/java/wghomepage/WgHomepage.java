package wghomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by kafiluddin on 5/26/17.
 */
public class WgHomepage extends CommonAPI {
    @FindBy(how = How.CSS, using = "#wag-header-mobile-slider > nav > ul > li.nav1.accordin-main.prescriptions > section > a.menu2.link")
    public static WebElement sectionPresRefil;
    @FindBy(how = How.CSS, using = "#wag-header-mobile-slider > nav > ul > li.nav2.accordin-main.healthinfo > section > a.menu2.link")
    public static WebElement sectionHealthinfoservice;
    @FindBy(how = How.CSS, using = "#wag-header-mobile-slider > nav > ul > li.nav3.accordin-main.contactlense > section > a.menu2.link")
    public static WebElement sectionContactlense;
    @FindBy(how = How.CSS, using = "#ShopProductsMenu")
    public static WebElement sectionShopproducts;
    @FindBy(how = How.CSS, using = "#wag-header-mobile-slider > nav > ul > li.wag-link-orange.accordin-main.photomenu > section > a.menu2.link")
    public static WebElement sectionPhoto;
    @FindBy(how = How.CSS, using = "body > section.mainLanding > div > wag:header > wag:nav > div > div.wag-top-nav-two-bg-full-width > section > article > ul > li:nth-child(2) > a")
    public static WebElement sectionWeeklycoupon;
    @FindBy(how = How.CSS, using = "body > section.mainLanding > div > wag:header > wag:nav > div > div.wag-top-nav-two-bg-full-width > section > article > ul > li:nth-child(3) > a")
    public static WebElement sectionHealthcareclinic;
    @FindBy(how = How.CSS, using = "body > section.mainLanding > div > wag:header > wag:nav > div > div.wag-top-nav-two-bg-full-width > section > article > ul > li:nth-child(4) > a")
    public static WebElement sectionBalancereward;
    // @FindBy(how = How.CSS, using = "")
   // public static WebElement section;


    public static WebElement getSectionHealthinfoservice() {
        return sectionHealthinfoservice;
    }

    public static WebElement getSectionContactlense() {
        return sectionContactlense;
    }

    public static WebElement getSectionShopproducts() {
        return sectionShopproducts;
    }

    public static WebElement getSectionPhoto() {
        return sectionPhoto;
    }

    public static WebElement getSectionWeeklycoupon() {
        return sectionWeeklycoupon;
    }

    public static WebElement getSectionHealthcareclinic() {
        return sectionHealthcareclinic;
    }

    public static WebElement getSectionBalancereward() {
        return sectionBalancereward;
    }

    public static WebElement getSectionPresRefil() {
        return sectionPresRefil;
    }
    public void clickonpresrefil(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionPresRefil().click();
    }
    public void clickonhealthinfoservice(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getSectionHealthinfoservice().click();
    }
    public void clickoncontactlense(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionContactlense().click();
    }
    public void clickonshopproducts(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionShopproducts().click();
    }
    public void clickonphoto(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionPhoto().click();
    }
    public void clickonweeklycoupon(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionWeeklycoupon().click();
    }
    public void clickonhealthcareclinic(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionHealthcareclinic().click();
    }
    public void clickonbalancereward(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionBalancereward().click();
    }

}

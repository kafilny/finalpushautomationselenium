package cnnhomepage;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utility.reporting.TestLogger;

/**
 * Created by kafiluddin on 5/22/17.
 */
public class CHomePage extends CommonAPI {

    //#nav > div.nav__container > div.nav-menu-links > a:nth-child(1)
    @FindBy(how = How.CSS, using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(1)")
    public static WebElement sectionmenuus;
    @FindBy(how = How.CSS, using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(2)")
    public static WebElement sectionmenuworld;
    @FindBy(how = How.CSS, using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(3)")
    public static WebElement sectionmenupolitics;
    @FindBy(how = How.CSS, using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(4)")
    public static WebElement sectionmenumoney;
    @FindBy(how = How.CSS, using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(5)")
    public static WebElement sectionmenuopinion;
    @FindBy(how = How.CSS,using = "#nav .nav__container .nav-menu-links a:nth-child(6)")
    public static WebElement sectionmenuhealth;
    @FindBy(how = How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(7)")
    public static WebElement sectionmenuentertainment;
    @FindBy(how = How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(8)")
    public static WebElement sectionmenutech;
    @FindBy(how = How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(9)")
    public static WebElement sectionmenustyle;
    @FindBy(how = How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(10)")
    public static WebElement sectionmenutravel;
    @FindBy(how = How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(11)")
    public static WebElement sectionmenusports;
    @FindBy(how = How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(12)")
    public static WebElement sectionmenuvideo;
    @FindBy(how = How.CSS,using = "#nav > div.nav__container > div.nav-menu-links > a:nth-child(13)")
    public static WebElement sectionmenuvr;

    public static WebElement getSectionmenuus() {

        return sectionmenuus;
    }

    public static WebElement getSectionmenuworld() {

        return sectionmenuworld;
    }

    public static WebElement getSectionmenupolitics() {

        return sectionmenupolitics;
    }

    public static WebElement getSectionmenumoney() {

        return sectionmenumoney;
    }

    public static WebElement getSectionmenuopinion() {

        return sectionmenuopinion;
    }

    public static WebElement getSectionmenuhealth() {
        return sectionmenuhealth;
    }

    public static WebElement getSectionmenuentertainment() {
        return sectionmenuentertainment;
    }

    public static WebElement getSectionmenutech() {
        return sectionmenutech;
    }

    public static WebElement getSectionmenustyle() {
        return sectionmenustyle;
    }

    public static WebElement getSectionmenutravel() {
        return sectionmenutravel;
    }

    public static WebElement getSectionmenusports() {
        return sectionmenusports;
    }

    public static WebElement getSectionmenuvideo() {
        return sectionmenuvideo;
    }

    public static WebElement getSectionmenuvr() {
        return sectionmenuvr;
    }

    public void clickonus(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getSectionmenuus().click();
   }
   public void clickonworld(){
       TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getSectionmenuworld().click();
   }
   public void clickonpolitics(){
       TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       getSectionmenupolitics().click();
   }
    public void clickonmoney(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      getSectionmenumoney().click();
    }
    public void clickonopinion(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
      getSectionmenuopinion().click();
    }
    public void clickonhealth(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionmenuhealth().click();
    }
    public void clickonentertainment(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionmenuentertainment().click();
    }
    public void clickontech(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionmenutech().click();
    }
    public void clickonstyle(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionmenustyle().click();
    }
    public void clickontravel(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionmenutravel().click();
    }
    public void clickonsports(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionmenusports().click();
    }
    public void clickonvideo(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionmenuvideo().click();
    }
    public void clickonvr(){
        TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        getSectionmenuvr().click();
    }


}



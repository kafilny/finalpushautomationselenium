package homescreen;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by kafiluddin on 5/16/17.
 */
public class HomeScreen {
    @FindBy(how = How.CSS, using = "#header .fullbleed-wrap .fullbleed-wrap dark-bleed .globalnav-wrap .category-nav .primary-nav .nav-item js-navitem main-nav productsMenu #products")
    public static WebElement productssMenu;

}

package search;

import base.CommonAPI;
import utility.reporting.TestLogger;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PIIT_NYA on 5/14/2017.
 */
 public class DropDownMenuPage extends CommonAPI {

        public List<String> getMenus(){
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<String> items = new ArrayList<String>();
            items = getTextFromWebElements("#ntt-placeholder option");
            return items;
        }

        public void typeOnInputSearch(List<String> data)throws InterruptedException{
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            for(int i=0; i<5; i++) {
                typeByCss("#ntt-placeholder", data.get(i));
                input();
                sleepFor(2);
                clearBox();
            }
        }

        public void input() {
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            keysInput("#ntt-placeholder");
        }
        public void clearBox() {
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            clearInput("#ntt-placeholder");
        }

        public void dropDownSearch()throws InterruptedException{
            TestLogger.log(getClass().getSimpleName() + ": " + converToString(new Object(){}.getClass().getEnclosingMethod().getName()));
            List<String> items = getMenus();
            typeOnInputSearch(items);
        }
}

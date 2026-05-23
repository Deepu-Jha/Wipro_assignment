package assignment_day_26;

import org.testng.annotations.Test;

public class SearchTest extends BaseClass {

    @Test
    public void searchTest() throws Exception {

        setup();

        SearchPage sp = new SearchPage(driver);

        sp.searchProduct("iPhone");

        closeBrowser();
    }
}
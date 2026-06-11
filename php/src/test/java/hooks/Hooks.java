package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import base.BaseClass;

public class Hooks {

    @Before
    public void setupBrowser() throws Exception {
        BaseClass.setup();
    }

    @After
    public void closeBrowser() {
        BaseClass.tearDown();
    }
}
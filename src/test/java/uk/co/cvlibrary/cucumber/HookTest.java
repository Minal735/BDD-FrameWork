package uk.co.cvlibrary.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import uk.co.cvlibrary.basepage.BasePage;
import uk.co.cvlibrary.browserSelector.BrowserSelector;
import uk.co.cvlibrary.loadproperty.LoadProperty;

import java.util.concurrent.TimeUnit;

public class HookTest extends BasePage {

BrowserSelector browserSelector = new BrowserSelector();
    LoadProperty loadProperty = new LoadProperty();

    String baseUrl = loadProperty.getProperty("baseUrl");
    String browser = loadProperty.getProperty("browser");

    @Before
    public void openBrowser() {
        browserSelector.selectBrowser(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}

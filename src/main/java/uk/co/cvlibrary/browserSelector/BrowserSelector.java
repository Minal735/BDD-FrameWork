package uk.co.cvlibrary.browserSelector;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import uk.co.cvlibrary.basepage.BasePage;

public class BrowserSelector extends BasePage {
    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());
    String projectPath = System.getProperty("user.dir");


    public void selectBrowser (String browser){
        if(browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver", projectPath + "/driver/chromedriver.exe");
                log.info("Launching Chrome Browser");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", projectPath + "/driver/geckodriver.exe");
                log.info("Launching FireFox Browser");
                driver = new FirefoxDriver();
            } else {
                System.out.println("Browser is not available");
                log.info("Browser is not available");
            }
        }
    }






















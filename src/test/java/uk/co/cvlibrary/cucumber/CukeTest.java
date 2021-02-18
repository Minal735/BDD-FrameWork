package uk.co.cvlibrary.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import uk.co.cvlibrary.basepage.BasePage;
import uk.co.cvlibrary.cucumber.mystef.Homestef;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        //features = "home.feature",
        //glue = {"Homestef.java"},
        plugin = {"json:target/RunCuke/cucumber.json",
                "pretty", "html:target/cucumber-report/cucumber.html"},
        tags = "@Smoke"
)


public class CukeTest {


}


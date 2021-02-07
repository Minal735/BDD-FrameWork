package uk.co.cvlibrary.cucumber;

import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import uk.co.cvlibrary.basepage.BasePage;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        plugin = {"json:target/RunCuke/cucumber.json",
                "pretty", "html:target/cucumber-report/cucumber.html"},
        tags = "@Smoke"
)


public class CukeTest {


}


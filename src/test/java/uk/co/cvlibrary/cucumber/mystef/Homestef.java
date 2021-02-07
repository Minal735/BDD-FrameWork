package uk.co.cvlibrary.cucumber.mystef;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import uk.co.cvlibrary.pages.HomePage;

public class Homestef {
    HomePage homePage = new HomePage();


    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }


    @When("^I enter job title \"([^\"]*)\"$")
    public void iEnterJobTitle(String jobtitle) {
        homePage.enterKeyword(jobtitle);


    }

    @And("^I enter location \"([^\"]*)\"$")
    public void iEnterLocation(String location) throws InterruptedException {
        homePage.enterLocation(location);

    }

    @And("^I select distance \"([^\"]*)\"$")
    public void iSelectDistance(String distance) {
        homePage.selectDistanceFromDropDown(distance);

    }

    @And("^I click on more options$")
    public void iClickOnMoreOptions() {
        homePage.clickOnMoreSearchOption();
    }

    @And("^I enter salary min \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterSalaryMinAnd(String salarymin, String salaryMax) {
        homePage.enterSalaryMin(salarymin);
        homePage.enterSalaryMax(salaryMax);
    }

    @And("^I select salary type \"([^\"]*)\"$")
    public void iSelectSalaryType(String perannum) {
        homePage.selectSalaryTypeFromDropDown(perannum);
    }

    @And("^I select job type \"([^\"]*)\"$")
    public void iSelectJobType(String permenant) {
        homePage.selectJobType(permenant);

    }

    @And("^I click on find jobs button$")
    public void iClickOnFindJobsButton() throws InterruptedException {
        Thread.sleep(5000);
        homePage.clickOnFindJobRutton();
    }

    @Then("^I should be able to see result with keyword \"([^\"]*)\"$")
    public void iShouldBeAbleToSeeResultWithKeyword(String args) {
    Assert.assertEquals("Permanent Qa Tester jobs in Pinner",homePage.getText());
    }

    @And("^I handle Iframe$")
    public void iHandleIframe() {
        homePage.handleIFrame();
    }
}




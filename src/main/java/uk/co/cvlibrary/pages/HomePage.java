package uk.co.cvlibrary.pages;

import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uk.co.cvlibrary.util.Util;

public class HomePage extends Util {
    private static final Logger log = LogManager.getLogger(HomePage.class);
    @FindBy(id = "keywords")
    WebElement _keyWordField;
    @FindBy(id = "location")
    WebElement _locationField;
    @FindBy(id = "distance")
    WebElement _distanceDropdown;
    @FindBy(id = "toggle-hp-search")
    WebElement _moreSearchOption;
    @FindBy(id = "salarymin")
    WebElement _salaryMin;
    @FindBy(id = "salarymax")
    WebElement _salaryMax;
    @FindBy(id = "salarytype")
    WebElement _salaryType;
    @FindBy(id = "tempperm")
    WebElement _jobType;
    @FindBy(id = "hp-search-btn")
    WebElement _findjob;
    @FindBy(id = "gdpr-consent-notice")
    WebElement _iframe;
    @FindBy(xpath = "//*[@id=\"save\"]")
    WebElement _submitBtn;
    @FindBy(xpath = "//*[@id=\"site-main\"]/div/div[1]/header/div[1]/h1")
    WebElement _getText;



    // This Method will get Text
    public String getText() {
        return getTextFromElement(_getText);
    }
    // This Method will handle iFrame popup
    public void handleIFrame() {
        driver.switchTo().frame(_iframe);
        clickOnElement(_submitBtn);
    }

    // This Method Enter The KeyWords/JobTitle
    public void enterKeyword(String keyword) {
        sendTextToElement(_keyWordField, keyword);
        log.info("Enter job title " + _keyWordField.toString());

    }

    // This Method Enter Location
    public void enterLocation(String location) {
        sendTextToElement(_locationField, location);
        log.info("Enter location title " + _locationField.toString());
    }

    // This Method Select Drop-down from the Text
    public void selectDistanceFromDropDown(String distance) {
//       waitUntilElementToBeClickableW(_distanceDropdown,20);
        selectByValueFromDropDown(_distanceDropdown, distance);
        log.info("Enter distance title " + _distanceDropdown.toString());

    }

    // This Method will click on More Search Option
    public void clickOnMoreSearchOption() {
        clickOnElement(_moreSearchOption);
        log.info("Click on more search  " + _moreSearchOption.toString());

    }

    // This Method enter salaryMin
    public void enterSalaryMin(String salarymin) {
        sendTextToElement(_salaryMin, salarymin);
        log.info("Enter salarymin " + _salaryMin.toString());

    }


    // This Method enter salaryMax
    public void enterSalaryMax(String salarymax) {
        sendTextToElement(_salaryMax, salarymax);
        log.info("Enter salarymax " + _salaryMax.toString());
    }

    // This Method select salaryType
    public void selectSalaryTypeFromDropDown(String salarytype) {
        selectByVisibleTextFromDropDown(_salaryType, salarytype);
        log.info("Enter salarytype " + _salaryType.toString());

    }

    // This Method select Jobtype
    public void selectJobType(String jobtype) {
        selectByValueFromDropDown(_jobType, jobtype);
        log.info("Enter jobtype " + _jobType.toString());
//        scrollWindowUp();
    }

    // Click findJob button
    public void clickOnFindJobRutton() {
        waitUntilElementToBeClickableW(_findjob, 50);
        _findjob.submit();
//       clickOnElement(_findjob);
        log.info("Enter jobtype " + _findjob.toString());
    }


}

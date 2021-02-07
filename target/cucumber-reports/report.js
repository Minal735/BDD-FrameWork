$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/uk/co/cvlibrary/resources/featurefile/home.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page Functionality",
  "description": "",
  "id": "home-page-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "User should able to enter into keyword search bar sucessfully",
  "description": "",
  "id": "home-page-functionality;user-should-able-to-enter-into-keyword-search-bar-sucessfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter text into the keyword field",
  "keyword": "When "
});
formatter.match({
  "location": "Homestef.iAmOnHomePage()"
});
formatter.result({
  "duration": 290139200,
  "status": "passed"
});
formatter.match({
  "location": "Homestef.iEnterTextIntoTheKeywordField()"
});
formatter.result({
  "duration": 120977200,
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy15.sendKeys(Unknown Source)\r\n\tat uk.co.cvlibrary.util.Util.sendTextToElement(Util.java:36)\r\n\tat uk.co.cvlibrary.pages.HomePage.enterkeyword(HomePage.java:18)\r\n\tat uk.co.cvlibrary.cucumber.mystef.Homestef.iEnterTextIntoTheKeywordField(Homestef.java:14)\r\n\tat ✽.When I enter text into the keyword field(src/test/java/uk/co/cvlibrary/resources/featurefile/home.feature:6)\r\n",
  "status": "failed"
});
});
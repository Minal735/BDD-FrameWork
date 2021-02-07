$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/uk/co/cvlibrary/resources/featurefile/home.feature");
formatter.feature({
  "name": "Home Page search functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "As a user all search functionality fields accessible successfully",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter job title \"\u003ckeywordfield\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I enter location \"\u003clocation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select distance \"\u003cdistance\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I handle Iframe",
  "keyword": "And "
});
formatter.step({
  "name": "I click on more options",
  "keyword": "And "
});
formatter.step({
  "name": "I enter salary min \"\u003csalaryMin\u003e\" and \"\u003csalaryMax\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select salary type \"\u003csalaryType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I select job type \"\u003cjobType\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on find jobs button",
  "keyword": "And "
});
formatter.step({
  "name": "I should be able to see result with keyword \"\u003cresult\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "keywordfield",
        "location",
        "distance",
        "salaryMin",
        "salaryMax",
        "salaryType",
        "jobType"
      ]
    },
    {
      "cells": [
        "QA Tester",
        "Pinner",
        "75",
        "35000",
        "37000",
        "Per annum",
        "Permanent"
      ]
    }
  ]
});
formatter.scenario({
  "name": "As a user all search functionality fields accessible successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "Homestef.iAmOnHomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter job title \"QA Tester\"",
  "keyword": "When "
});
formatter.match({
  "location": "Homestef.iEnterJobTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter location \"Pinner\"",
  "keyword": "And "
});
formatter.match({
  "location": "Homestef.iEnterLocation(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select distance \"75\"",
  "keyword": "And "
});
formatter.match({
  "location": "Homestef.iSelectDistance(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I handle Iframe",
  "keyword": "And "
});
formatter.match({
  "location": "Homestef.iHandleIframe()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on more options",
  "keyword": "And "
});
formatter.match({
  "location": "Homestef.iClickOnMoreOptions()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter salary min \"35000\" and \"37000\"",
  "keyword": "And "
});
formatter.match({
  "location": "Homestef.iEnterSalaryMinAnd(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select salary type \"Per annum\"",
  "keyword": "And "
});
formatter.match({
  "location": "Homestef.iSelectSalaryType(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select job type \"Permanent\"",
  "keyword": "And "
});
formatter.match({
  "location": "Homestef.iSelectJobType(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on find jobs button",
  "keyword": "And "
});
formatter.match({
  "location": "Homestef.iClickOnFindJobsButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should be able to see result with keyword \"\u003cresult\u003e\"",
  "keyword": "Then "
});
formatter.match({
  "location": "Homestef.iShouldBeAbleToSeeResultWithKeyword(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
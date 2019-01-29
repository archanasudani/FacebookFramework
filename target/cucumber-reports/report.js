$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
formatter.feature({
  "line": 2,
  "name": "Chrome Installed",
  "description": "",
  "id": "chrome-installed",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Two"
    }
  ]
});
formatter.before({
  "duration": 3338953394,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Chrome Installation",
  "description": "",
  "id": "chrome-installed;chrome-installation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@a"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "That the user is navigated to the ChromeBrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I access facebook url",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I see facebook homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepDef.step1()"
});
formatter.result({
  "duration": 117524204,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.step2()"
});
formatter.result({
  "duration": 3060509944,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.step3()"
});
formatter.result({
  "duration": 910933646,
  "status": "passed"
});
formatter.after({
  "duration": 52480,
  "status": "passed"
});
formatter.before({
  "duration": 2441355658,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Chrome Installation",
  "description": "",
  "id": "chrome-installed;chrome-installation",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@a"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "That the user is navigated to the ChromeBrowser",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "I access amazon url",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "I see amazon homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "TestStepDef.step1()"
});
formatter.result({
  "duration": 80640,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.step6()"
});
formatter.result({
  "duration": 3887751537,
  "status": "passed"
});
formatter.match({
  "location": "TestStepDef.step7()"
});
formatter.result({
  "duration": 790581491,
  "status": "passed"
});
formatter.after({
  "duration": 55894,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ZaiperHomePageSearch.feature");
formatter.feature({
  "name": "Make search on ziper home page",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CucumberHooks"
    }
  ]
});
formatter.scenario({
  "name": "Test Scenario1",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CucumberHooks"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ZaiperHomePageSearchDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter some string in search text box",
  "keyword": "Then "
});
formatter.match({
  "location": "ZaiperHomePageSearchDefinition.user_enter_some_string_in_search_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select item from search list",
  "keyword": "And "
});
formatter.match({
  "location": "ZaiperHomePageSearchDefinition.select_item_from_search_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on item",
  "keyword": "Then "
});
formatter.match({
  "location": "ZaiperHomePageSearchDefinition.click_on_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify searchitem",
  "keyword": "And "
});
formatter.match({
  "location": "ZaiperHomePageSearchDefinition.verify_searchitem()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Test Scenario2",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CucumberHooks"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ZaiperHomePageSearchDefinition.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter some string in search text box",
  "keyword": "Then "
});
formatter.match({
  "location": "ZaiperHomePageSearchDefinition.user_enter_some_string_in_search_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select item from search list",
  "keyword": "And "
});
formatter.match({
  "location": "ZaiperHomePageSearchDefinition.select_item_from_search_list()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on item",
  "keyword": "Then "
});
formatter.match({
  "location": "ZaiperHomePageSearchDefinition.click_on_item()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify searchitem",
  "keyword": "And "
});
formatter.match({
  "location": "ZaiperHomePageSearchDefinition.verify_searchitem()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
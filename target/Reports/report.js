$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Featurefiles/Login.feature");
formatter.feature({
  "name": "validate the login functionality of facebook",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate the login functionality with invalid username and invalid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user should launch the browser and load the url",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefinition.user_should_launch_the_browser_and_load_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should enter invalid usernamE and invalid password",
  "rows": [
    {
      "cells": [
        "Fruits",
        "Veg",
        "FastFood",
        "Starters"
      ]
    },
    {
      "cells": [
        "Orange",
        "Carrot",
        "Maggi",
        "Soup"
      ]
    },
    {
      "cells": [
        "Apple",
        "Lfinger",
        "Samosa",
        "Chicken"
      ]
    },
    {
      "cells": [
        "Grape",
        "Onion",
        "Bread",
        "Masala"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdefinition.user_should_enter_invalid_usernamE_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefinition.user_should_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should navigate to incredential page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.user_should_navigate_to_incredential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
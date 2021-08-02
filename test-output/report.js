$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/java training/FreecrmBDDFramework/src/main/java/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "CRM login Feature",
  "description": "",
  "id": "crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Free CRM creates a new scenario",
  "description": "",
  "id": "crm-login-feature;free-crm-creates-a-new-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already on Login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "Password"
      ],
      "line": 8
    },
    {
      "cells": [
        "praveenjairaj66@gmail.com",
        "0123456789"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user moves on homeicon",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "user clicks on deals",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "user clicks on new deal",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "user enter deal details",
  "rows": [
    {
      "cells": [
        "title",
        "assigned to",
        "Company",
        "products",
        "contacts",
        "amount",
        "commission",
        "stage"
      ],
      "line": 16
    },
    {
      "cells": [
        "new contact",
        "praveen kumar",
        "cognizant",
        "assets",
        "9642521109",
        "50",
        "20",
        "Research"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepdefinition.user_is_already_on_Login_page()"
});
formatter.result({
  "duration": 4033237600,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefinition.title_of_login_page_is_free_CRM()"
});
formatter.result({
  "duration": 150045000,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 2153147200,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 54704900,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 4867300,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefinition.user_moves_on_homeicon()"
});
formatter.result({
  "duration": 1624913300,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefinition.user_clicks_on_deals()"
});
formatter.result({
  "duration": 161027700,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefinition.user_clicks_on_new_deal()"
});
formatter.result({
  "duration": 203061500,
  "status": "passed"
});
formatter.match({
  "location": "loginStepdefinition.user_enter_deal_details(DataTable)"
});
formatter.result({
  "duration": 365802900,
  "status": "passed"
});
});
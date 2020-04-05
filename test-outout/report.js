$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("facebooklogin.feature");
formatter.feature({
  "line": 1,
  "name": "facebook login",
  "description": "",
  "id": "facebook-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "to test  facebook",
  "description": "",
  "id": "facebook-login;to-test--facebook",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Open the firefox and start application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter valid username and valid password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User should be able to login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.open_the_firefox_and_start_application()"
});
formatter.result({
  "duration": 16434394960,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_enter_valid_username_and_valid_password()"
});
formatter.result({
  "duration": 2398201100,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.user_should_be_able_to_login_successfully()"
});
formatter.result({
  "duration": 6661372432,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM Login Feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
});
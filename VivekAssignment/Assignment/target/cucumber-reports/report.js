$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Resource/features/calculator.feature");
formatter.feature({
  "line": 3,
  "name": "Verification of calculator functionality",
  "description": "",
  "id": "verification-of-calculator-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "verify that the calculator is working properly",
  "description": "",
  "id": "verification-of-calculator-functionality;verify-that-the-calculator-is-working-properly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User select single for Application type",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User select zero dependant",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters \"80000\" for anual income",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enter \"10000\" for other anual income",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enter \"500\" for lving expenses",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enter \"0\" for Current home loan monthly repayment",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enter \"100\" for Other loan monthly repayment",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enter \"0\" for other commitments",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enter \"10000\" for credit card limit",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click on start over button",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User enter \"1\" for lving expenses",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user click on borrow button calculator",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "verify the message",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorStepDefinitions.user_is_on_Home_page()"
});
formatter.result({
  "duration": 16116167064,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorStepDefinitions.user_select_single_for_Application_type()"
});
formatter.result({
  "duration": 159054427,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorStepDefinitions.user_select_zero_dependant()"
});
formatter.result({
  "duration": 126889034,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "80000",
      "offset": 13
    }
  ],
  "location": "CalculatorStepDefinitions.user_enters_for_anual_income(String)"
});
formatter.result({
  "duration": 217755063,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 12
    }
  ],
  "location": "CalculatorStepDefinitions.user_enter_for_other_anual_income(String)"
});
formatter.result({
  "duration": 405678697,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500",
      "offset": 12
    }
  ],
  "location": "CalculatorStepDefinitions.user_enter_for_lving_expenses(String)"
});
formatter.result({
  "duration": 220745390,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 12
    }
  ],
  "location": "CalculatorStepDefinitions.user_enter_for_Current_home_loan_monthly_repayment(String)"
});
formatter.result({
  "duration": 207604269,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 12
    }
  ],
  "location": "CalculatorStepDefinitions.user_enter_for_Other_loan_monthly_repayment(String)"
});
formatter.result({
  "duration": 193843220,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0",
      "offset": 12
    }
  ],
  "location": "CalculatorStepDefinitions.user_enter_for_other_commitments(String)"
});
formatter.result({
  "duration": 148547482,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 12
    }
  ],
  "location": "CalculatorStepDefinitions.user_enter_for_credit_card_limit(String)"
});
formatter.result({
  "duration": 259713561,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorStepDefinitions.user_click_on_start_over_button()"
});
formatter.result({
  "duration": 297499866,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 12
    }
  ],
  "location": "CalculatorStepDefinitions.user_enter_for_lving_expenses(String)"
});
formatter.result({
  "duration": 109813324,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorStepDefinitions.user_click_on_borrow_button_calculator()"
});
formatter.result({
  "duration": 183689860,
  "status": "passed"
});
formatter.match({
  "location": "CalculatorStepDefinitions.verify_the_message()"
});
formatter.result({
  "duration": 164922180,
  "status": "passed"
});
});
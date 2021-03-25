$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/purchase/Purchase.feature");
formatter.feature({
  "name": "Login on the Sauce Labs Testing",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Frontend"
    }
  ]
});
formatter.scenario({
  "name": "Purchase flow until defining payment information",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Frontend"
    },
    {
      "name": "@Purchase"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Homepage has been loaded",
  "keyword": "Given "
});
formatter.match({
  "location": "com.example.tests.steps.PurchaseSteps.homepage_has_been_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/");
formatter.embedding("image/png", "embedded0.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "search a product",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.tests.steps.PurchaseSteps.search_a_product()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/checkout/#/email");
formatter.embedding("image/png", "embedded1.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "choose buy the product and fill personal credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.tests.steps.PurchaseSteps.choose_buy_the_product_and_fill_personal_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/checkout/#/payment");
formatter.embedding("image/png", "embedded2.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate that Free Shipping",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.tests.steps.PurchaseSteps.validate_that_Free_Shipping()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/checkout/#/payment");
formatter.embedding("image/png", "embedded3.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
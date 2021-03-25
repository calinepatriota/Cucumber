$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/purchase/Purchase.feature");
formatter.feature({
  "name": "Samsung Web Testing",
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
  "location": "com.example.tests.steps.HomeSteps.homepage_has_been_loaded()"
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
formatter.write("Current Page URL is https://shop.samsung.com/br/checkout/#/shipping");
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
formatter.scenario({
  "name": "Print the smartphones name",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Frontend"
    },
    {
      "name": "@ListSmartphones"
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
  "location": "com.example.tests.steps.HomeSteps.homepage_has_been_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/");
formatter.embedding("image/png", "embedded4.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on meunuBar Telefonia",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.tests.steps.ListSmartphonesSteps.click_on_meunuBar_Telefonia()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/mobile/smartphone?order\u003dOrderByPriceDESC");
formatter.embedding("image/png", "embedded5.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Choose Menor preco filter",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.tests.steps.ListSmartphonesSteps.choose_Menor_preco_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/mobile/smartphone?order\u003dOrderByPriceASC");
formatter.embedding("image/png", "embedded6.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Validate all smartphones are visible as filter",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.tests.steps.ListSmartphonesSteps.validate_all_smartphones_are_visible_as_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/mobile/smartphone?order\u003dOrderByPriceASC\u0026page\u003d3");
formatter.embedding("image/png", "embedded7.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Print ship information available in the FAQ",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Frontend"
    },
    {
      "name": "@FAQOnline"
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
  "location": "com.example.tests.steps.HomeSteps.homepage_has_been_loaded()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/");
formatter.embedding("image/png", "embedded8.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click on FAQ Loja Online link",
  "keyword": "When "
});
formatter.match({
  "location": "com.example.tests.steps.FAQSteps.click_on_FAQ_Loja_Online_link()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://www.samsung.com/br/");
formatter.embedding("image/png", "embedded9.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "click Entrega link",
  "keyword": "And "
});
formatter.match({
  "location": "com.example.tests.steps.FAQSteps.click_Entrega_link()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/faq");
formatter.embedding("image/png", "embedded10.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "Print the third question presented and the answer of this question",
  "keyword": "Then "
});
formatter.match({
  "location": "com.example.tests.steps.FAQSteps.print_the_third_question_presented_and_the_answer_of_this_question()"
});
formatter.result({
  "status": "passed"
});
formatter.write("Current Page URL is https://shop.samsung.com/br/faq");
formatter.embedding("image/png", "embedded11.png", "");
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
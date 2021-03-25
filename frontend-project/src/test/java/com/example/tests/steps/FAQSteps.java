package com.example.tests.steps;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import setup.Setup;
import utils.Utils;
import website.actions.FAQActions;

public class FAQSteps extends Setup {
	
	@When("click on FAQ Loja Online link")
	public void click_on_FAQ_Loja_Online_link() throws InterruptedException, IOException {
		FAQActions linkFAQ= new FAQActions(driver);
		linkFAQ.clickLinkFAQ();
	}

	@When("click Entrega link")
	public void click_Entrega_link() throws InterruptedException, IOException {
		FAQActions linkEntrega= new FAQActions(driver);
		linkEntrega.faqEntrega();
	}

	@Then("Print the third question presented and the answer of this question")
	public void print_the_third_question_presented_and_the_answer_of_this_question() throws InterruptedException, IOException {
		FAQActions printQuestion= new FAQActions(driver);
		printQuestion.faqPrintThridQuestion();
	}

	
}

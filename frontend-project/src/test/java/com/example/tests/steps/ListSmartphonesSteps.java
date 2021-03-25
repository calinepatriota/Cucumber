package com.example.tests.steps;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import setup.Setup;
import website.actions.ListSmartphonesActions;

public class ListSmartphonesSteps extends Setup {
	
	@When("click on meunuBar Telefonia")
	public void click_on_meunuBar_Telefonia() throws InterruptedException, IOException {
		ListSmartphonesActions menuBar = new ListSmartphonesActions(driver);
		menuBar.menuTelefonia();
	}

	@When("Choose Menor preco filter")
	public void choose_Menor_preco_filter() throws InterruptedException, IOException {
		ListSmartphonesActions filter = new ListSmartphonesActions(driver);
		filter.orderBy();
	}

	@Then("Validate all smartphones are visible as filter")
	public void validate_all_smartphones_are_visible_as_filter() throws InterruptedException, IOException {
		ListSmartphonesActions print = new ListSmartphonesActions(driver);
		print.printSmartphones();
	}

	
}

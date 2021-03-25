package com.example.tests.steps;

import java.io.IOException;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import setup.Setup;
import utils.Constants;
import website.actions.HomeActions;
import website.actions.PersonalInformationsActions;

public class PurchaseSteps extends Setup {
	
	@When("search a product")
	public void search_a_product() throws InterruptedException, IOException {
		HomeActions searchProduct = new HomeActions(driver);
		searchProduct.searchProduct(Constants.PRODUCT,Constants.ZIP_CODE);
	}

	@When("choose buy the product and fill personal credentials")
	public void choose_buy_the_product_and_fill_personal_credentials() throws InterruptedException, IOException {
		PersonalInformationsActions personalInformations = new PersonalInformationsActions(driver);
		personalInformations.addressInformation(Constants.DOCUMENT,Constants.PHRONENUMBER);
	}

	@Then("Validate that Free Shipping")
	public void validate_that_Free_Shipping() throws InterruptedException, IOException {
		PersonalInformationsActions personalInformations = new PersonalInformationsActions(driver);
		personalInformations.validateFreeShipping();
	}



	
	
}

package com.example.tests.steps;

import java.io.IOException;

import io.cucumber.java.en.Given;
import setup.Setup;
import utils.Constants;
import website.actions.HomeActions;

public class HomeSteps extends Setup {
	
	@Given("Homepage has been loaded")
	public void homepage_has_been_loaded() throws InterruptedException, IOException {
	 driver.get(Constants.WEBSITE);
	   HomeActions validateHome = new HomeActions(driver);
	   validateHome.validateHomePage();
	}
}

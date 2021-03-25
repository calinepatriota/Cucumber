
package com.example.tests.steps;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriverException;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import setup.Setup;

public class ServiceHooks {

	public static Scenario scenario;
	Setup driver = new Setup();

	@Before
	public void before(Scenario scenario) throws IOException, InterruptedException {

		ServiceHooks.scenario = scenario;
		System.out.println(scenario.getSourceTagNames());
		System.out.println("Starting - " + scenario.getName());
		driver.before();
	}

	@AfterStep
	public void afterStep(Scenario scenario) throws InterruptedException, IOException {

		try {
			scenario.log("Current Page URL is " + driver.getDriver().getCurrentUrl());
			byte[] screenshot = ((TakesScreenshot) driver.getDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "");
		} catch (WebDriverException somePlatformsDontSupportScreenshots) {
			System.err.println(somePlatformsDontSupportScreenshots.getMessage());
		}
	}

	@After
	public void after(Scenario scenario) throws IOException {
		System.out.println("------------------------------");
		System.out.println(scenario.getName() + " - Status: " + scenario.getStatus());
		driver.after();
		

	}

}

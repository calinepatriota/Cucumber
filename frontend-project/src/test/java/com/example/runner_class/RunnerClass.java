package com.example.runner_class;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@CucumberOptions(
		features = {
				"classpath:features/purchase"
			},
			glue = {
				"com.example.tests.steps"
			},
			tags=
			//"@Purchase",
			//"@ListSmartphones",
			//"@FAQOnline",
			"@Frontend",
					plugin = {
							"timeline:dtarget/reports", 
							"json:target/reports/cucumber.json" 
							,"html:target/reports/report-html" 
				    },
			    monochrome = true )
			

@RunWith(Cucumber.class)
	public class RunnerClass {}


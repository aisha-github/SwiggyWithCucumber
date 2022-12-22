package com.swiggy.testscripts;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features",
		glue = "com.swiggy.testscripts"
		)

public class Runner extends AbstractTestNGCucumberTests {

}

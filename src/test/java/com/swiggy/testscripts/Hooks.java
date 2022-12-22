package com.swiggy.testscripts;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Tools {

	@Before
	public void setup(Scenario scenario) {
		Driver.init();
	}
	
	@After
	public void teardown() {
		driver.close();
	}
}

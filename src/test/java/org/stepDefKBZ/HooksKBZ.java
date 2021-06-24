package org.stepDefKBZ;

import org.baseKBZ.LibGlobalKBZ;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksKBZ extends LibGlobalKBZ {
	public WebDriver driver;
	@Before
	public void start() {
		browserLaunch();
		implicitWait();
		toMax();
	}

	@After
	public void end() {
		toQuit();

	}
}

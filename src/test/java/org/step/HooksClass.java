package org.step;

import java.io.IOException;

import org.help.LibGlobal;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends LibGlobal {
	
	@Before
	public void beforeScenario() {
		openchrome();
		launchUrl("https://www.facebook.com/");
		maxWin();
		

	}
	@After
	public void afterScenario(Scenario s) throws IOException {
		if (s.isFailed()) {
		String name = s.getName();
		String filename = name.replace("", "_");
		screenshot(filename);
		closeBrowser();
		}		
	}

	}

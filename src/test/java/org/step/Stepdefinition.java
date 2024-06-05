package org.step;

import java.util.List;
import java.util.Map;

import org.help.LibGlobal;
import org.junit.Assert;
import org.objectrepository.LoginPojo;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class Stepdefinition extends LibGlobal {
	@Given("user should launch the browser and load the url")
	public void user_should_launch_the_browser_and_load_the_url() {
		//code mentioned in HooksClass
	    
	}

	@When("user should enter invalid username{string} and invalid password{string}")
	public void user_should_enter_invalid_username_and_invalid_password(String s1, String s2) {
		LoginPojo l = new LoginPojo();
		WebElement username = l.getUsername();
		fill(username, s1);
		WebElement pass = l.getPassword();
		fill(pass, s2);
		
	    
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
		LoginPojo l = new LoginPojo();
		WebElement btn = l.getLoginbtn();
		click(btn);
		
	    
	}

	@Then("user should navigate to incredential page")
	public void user_should_navigate_to_incredential_page() {
		String url = driver.getCurrentUrl();
		Assert.assertTrue("checkurl",url.contains("login"));
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("Testcase Passed");
	    
	}
	@When("user should enter invalid usernamE and invalid password")
	public void user_should_enter_invalid_usernamE_and_invalid_password(io.cucumber.datatable.DataTable d) {
		LoginPojo l = new LoginPojo();
		WebElement username = l.getUsername();
		List<Map<String, String>> mp = d.asMaps();
		String s1 = mp.get(1).get("Starters");
		fill(username, s1);
		WebElement pass = l.getPassword();
		fill(pass, mp.get(2).get("FastFood"));
		
		
		
		
		
		
		
		
		
		
		
}
}
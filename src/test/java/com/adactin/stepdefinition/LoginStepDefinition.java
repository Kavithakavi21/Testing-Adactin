
package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner;
import com.base.org.Base_Class;
import com.pom.org.Loginpage;
import com.pom.org.SearchHotel;

import cucumber.api.java.en.*;

public class LoginStepDefinition extends Base_Class {

	public static WebDriver driver = Runner.driver;

	Loginpage lp = new Loginpage(driver);

	@Given("^User launch application$")
	public void user_launch_application() throws Throwable {
		getUrl("https://adactinhotelapp.com/");
	}

	@When("^User enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
		inputValueElement(lp.getUsername(), arg1);
	}

	@When("^User enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
		inputValueElement(lp.getPassword(), arg1);
	}

	@Then("^User verify valid username and valid password$")
	public void user_verify_valid_username_and_valid_password() throws Throwable {
		clickOnElement(lp.getLogin());
	}
}

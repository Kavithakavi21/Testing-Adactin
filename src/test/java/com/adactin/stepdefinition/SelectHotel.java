package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner;
import com.base.org.Base_Class;
import com.pom.org.Hotel;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectHotel extends Base_Class {
	
	public static WebDriver driver= Runner.driver;
	
	 Hotel h= new Hotel (driver);	
	
		

	@When("^User checked the selected hotel$")
	public void user_checked_the_selected_hotel() throws Throwable {
		clickOnElement(h.getClick());
	}

	@Then("^User click on continue Button$")
	public void user_click_on_continue_Button() throws Throwable {
		clickOnElement(h.getContinue());
	}

	

}

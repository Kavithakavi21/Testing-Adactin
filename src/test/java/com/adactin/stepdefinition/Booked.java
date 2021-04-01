package com.adactin.stepdefinition;


import org.openqa.selenium.WebDriver;

import com.adactin.runner.Runner;
import com.base.org.Base_Class;
import com.pom.org.BookedPom;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Booked extends Base_Class{
	
	public static WebDriver driver= Runner.driver;
	
	BookedPom bp=new BookedPom (driver);
	
	
	@When("^User enter \"([^\"]*)\" as first name$")
	public void user_enter_as_first_name(String arg1) throws Throwable {
		Thread.sleep(2000);
	inputValueElement(bp.getFirstname(), arg1);
			
	}

	@When("^User enter \"([^\"]*)\" as last name$")
	public void user_enter_as_last_name(String arg1) throws Throwable {
		Thread.sleep(2000);
		inputValueElement(bp.getLastname(), arg1);
		
	}

	@When("^User enter \"([^\"]*)\" as billing address$")
	public void user_enter_as_billing_address(String arg1) throws Throwable {
		Thread.sleep(2000);
		inputValueElement(bp.getAddress(), arg1);
	}

	@When("^User enter \"([^\"]*)\" as credit card no$")
	public void user_enter_as_credit_card_no(String arg1) throws Throwable {
		Thread.sleep(2000);
		inputValueElement(bp.getCcnum(), arg1);
	}

	@When("^User select \"([^\"]*)\" as Credit Card Type$")
	public void user_select_as_Credit_Card_Type(String arg1) throws Throwable {
		Thread.sleep(2000);
		selection(bp.getCctype(),"byValue", arg1);
	}

	@When("^User select \"([^\"]*)\" as Expiry date$")
	public void user_select_as_Expiry_date(String arg1) throws Throwable {
		Thread.sleep(2000);
		selection(bp.getCcexp(),"byValue", arg1);		
	}
	
	@When("^User select \"([^\"]*)\" as Expiry  year$")
	public void user_select_as_Expiry_year(String arg1) throws Throwable {
		
		selection(bp.getCcyear(),"byValue", arg1);
	}

	@When("^User select \"([^\"]*)\" as CVV Number$")
	public void user_select_as_CVV_Number(String arg1) throws Throwable {
		Thread.sleep(2000);
		inputValueElement(bp.getCvv(), arg1);
	}

	@Then("^User click on Book now$")
	public void user_click_on_Book_now() throws Throwable {
		Thread.sleep(2000);
		clickOnElement(bp.getBooked());
	}



}

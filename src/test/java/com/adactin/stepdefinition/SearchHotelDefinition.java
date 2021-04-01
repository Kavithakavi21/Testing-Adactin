package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactin.runner.Runner;
import com.base.org.Base_Class;
import com.pom.org.SearchHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelDefinition extends Base_Class {
	
	public static WebDriver driver= Runner.driver;

	SearchHotel s=new SearchHotel(driver);	



	@Given("^User selecting \"([^\"]*)\" Location$")
	public void user_selecting_Location(String arg1) throws Throwable {
		Thread.sleep(2000);
	selection(s.getLocation(),"byValue", arg1);
	}	
		

	@When("^User select \"([^\"]*)\" hotel$")
	public void user_select_hotel(String arg1) throws Throwable {
		Thread.sleep(2000);
		selection(s.getHotels(), "byValue", arg1);
	
	}
	

	@When("^User select \"([^\"]*)\" Roomtype$")
	public void user_select_Roomtype(String arg1) throws Throwable {
		Thread.sleep(2000);
		selection(s.getRoomtype(), "byValue", arg1);
		
	}
	

	@When("^User enter \"([^\"]*)\" Number of rooms$")
	public void user_enter_Number_of_rooms(String arg1) throws Throwable {
		Thread.sleep(2000);
		selection(s.getRoomnos(),"byValue", arg1);
	}
	

	@When("^User enter \"([^\"]*)\" as Check In Date$")
	public void user_enter_as_Check_In_Date(String arg1) throws Throwable {
		Thread.sleep(2000);
		elementClear(s.getDatepick());
		inputValueElement(s.getDatepick(), arg1);
	}
	

	@When("^User enter \"([^\"]*)\" as Check Out Date$")
	public void user_enter_as_Check_Out_Date(String arg1) throws Throwable {
		Thread.sleep(2000);
		elementClear(s.getDateout());
		inputValueElement(s.getDateout(), arg1);
	}

	@When("^User enter \"([^\"]*)\" Adult per Room$")
	public void user_enter_Adult_per_Room(String arg1) throws Throwable {
		Thread.sleep(2000);
		selection(s.getAdultroom(),"byValue", arg1);
		
	}

	@When("^User enter \"([^\"]*)\" Children per Room$")
	public void user_enter_Children_per_Room(String arg1) throws Throwable {
		Thread.sleep(2000);
		selection(s.getChildroom(), "byValue", arg1);
	}

	@Then("^User click on Search Button$")
	public void user_click_on_Search_Button() throws Throwable {
		Thread.sleep(2000);
		clickOnElement(s.getSubmit());
	}
	}






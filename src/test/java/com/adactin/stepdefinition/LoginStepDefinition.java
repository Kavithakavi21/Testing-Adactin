
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
	SearchHotel sh=new SearchHotel(driver);

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
	
	@Given("^User selecting \"([^\"]*)\" Location$")
	public void user_selecting_Location(String arg1) throws Throwable {
	selection(sh.getLocation(),arg1, arg1);
	}	
		

	@When("^User select \"([^\"]*)\" hotel$")
	public void user_select_hotel(String arg1) throws Throwable {
		selection(sh.getHotels(), arg1, arg1);
	}
	

	@When("^User select \"([^\"]*)\" Roomtype$")
	public void user_select_Roomtype(String arg1) throws Throwable {
	selection(sh.getRoomtype(), arg1, arg1);	
	}
	

	@When("^User enter \"([^\"]*)\" Number of rooms$")
	public void user_enter_Number_of_rooms(String arg1) throws Throwable {
		selection(sh.getRoomnos(), arg1, arg1);
	}
	

	@When("^User enter \"([^\"]*)\" as Check In Date$")
	public void user_enter_as_Check_In_Date(String arg1) throws Throwable {
		elementClear(sh.getDatepick());
		inputValueElement(sh.getDatepick(), arg1);
	}
	

	@When("^User enter \"([^\"]*)\" as Check Out Date$")
	public void user_enter_as_Check_Out_Date(String arg1) throws Throwable {
		elementClear(sh.getDateout());
		inputValueElement(sh.getDateout(), arg1);
	}

	@When("^User enter \"([^\"]*)\" Adult per Room$")
	public void user_enter_Adult_per_Room(String arg1) throws Throwable {
		selection(sh.getAdultroom(), arg1, arg1);
	}

	@When("^User enter \"([^\"]*)\" Children per Room$")
	public void user_enter_Children_per_Room(String arg1) throws Throwable {
		selection(sh.getChildroom(), arg1, arg1);
	}

	@Then("^User click on Search Button$")
	public void user_click_on_Search_Button() throws Throwable {
		clickOnElement(sh.getSubmit());
	}
	}



	
package com.pom.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
	
	public static WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement roomtype;

	@FindBy(id = "room_nos")
	private WebElement roomnos;

	@FindBy(id = "datepick_in")
	private WebElement datepick;

	@FindBy(id = "datepick_out")
	private WebElement dateout;
	
	@FindBy(id="Submit")
	private WebElement submit;
		
	

	public SearchHotel(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2,this );
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomnos() {
		return roomnos;
	}

	public WebElement getDatepick() {
		return datepick;
	}

	public WebElement getDateout() {
		return dateout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	@FindBy(id = "adult_room")
	private WebElement adultroom;

	@FindBy(id = "child_room")
	private WebElement childroom;


}

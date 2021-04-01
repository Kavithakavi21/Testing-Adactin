package com.pom.org;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel {
	
	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement click;
	
	@FindBy(id="continue")
	private WebElement Continue;
	
	

	public Hotel(WebDriver driver2) {
		this.driver=driver2;
		
		PageFactory.initElements(driver2, this);
	}

	public WebElement getClick() {
		return click;
	}

	public WebElement getContinue() {
		return Continue;
	}
	

}

package com.SpiceJet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;

public class FieldsAvailablePage extends SeWrappers
{
	//check in 
	@FindBy(xpath="//div[@data-testid='check-in-horizontal-nav-tabs']")
	WebElement checkIn;

	@FindBy(xpath="//div[text()='Web Check-In']")
	WebElement eleInCheck;
	
	
	//flight-status
	@FindBy(xpath="//div[@data-testid='flight status-horizontal-nav-tabs']")
	WebElement flightStatus;

	@FindBy(xpath="//div[text()='Flight Status']")
	WebElement eleStatus;

	//manage Booking
	@FindBy(xpath="//div[@data-testid='manage booking-horizontal-nav-tabs']")
	WebElement manageBooking;

	@FindBy(xpath="//div[text()='View / Manage Booking']")
	WebElement bookingStatus;

	SeWrappers se=new SeWrappers();
	public void fields()
	{
		//check in
		se.actionClick(checkIn);
		if(eleInCheck.isDisplayed())
			Reports.reportStep("PASS","Check-In field successfully validated");
		else
			Reports.reportStep("FAIL","Problem while validating the Check-In field");

		screenshot("CheckIn");

		//flight status
		se.actionClick(flightStatus);
		if(eleStatus.isDisplayed())
			Reports.reportStep("PASS","Flight status field successfully validated");
		else
			Reports.reportStep("FAIL","Problem while validating the Flight status field");		

		screenshot("flightStatus");
		
		
		//manage booking
		se.actionClick(manageBooking);
		if(bookingStatus.isDisplayed())
			Reports.reportStep("PASS","Manage Booking field successfully validated");
		else
			Reports.reportStep("FAIL","Problem while validating the Manage Booking  field");

		

}


}

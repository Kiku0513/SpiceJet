package com.SpiceJet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.utils.SeWrappers;

public class FieldsAvailablePage extends SeWrappers
{
	@FindBy(xpath="//*[@data-testid='check-in-horizontal-nav-tabs']")
	WebElement checkIn;
	
	@FindBy(xpath="//*[@data-testid='flight status-horizontal-nav-tabs']")
	WebElement flightStatus;
	
	@FindBy(xpath="//*[@data-testid='manage booking-horizontal-nav-tabs']")
	WebElement manageBooking;
	
	SeWrappers se=new SeWrappers();
	
	public void fieldsChecking() throws InterruptedException
	{	
		se.actionClick(checkIn);
	    se.screenshot("CheckIn");
	    Thread.sleep(1000);
		se.actionClick(flightStatus);
		se.screenshot("FlightStatus");
		Thread.sleep(1000);
		se.actionClick(manageBooking);
		se.screenshot("ManageBooking");
	}
}

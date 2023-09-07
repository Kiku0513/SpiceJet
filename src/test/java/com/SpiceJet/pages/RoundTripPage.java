package com.SpiceJet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.utils.SeWrappers;

public class RoundTripPage  extends SeWrappers
{
	SeWrappers se1=new SeWrappers();

	@FindBy(xpath="//*[@data-testid='round-trip-radio-button']//*[@class='css-1dbjc4n r-zso239']")
	WebElement roundTrip;

	@FindBy(xpath="//*[@data-testid='to-testID-origin']")
	WebElement originClick;

	@FindBy(xpath="//div[text()='Pune']")
	WebElement origin;

	@FindBy(xpath="//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[text()='Chennai']")
	WebElement departure;

	@FindBy(xpath="//*[@data-testid='home-page-travellers']")
	WebElement passenger;

	@FindBy(xpath="//*[@data-testid='Adult-testID-plus-one-cta']")
	WebElement adult;
	
	@FindBy(xpath="//*[@data-testid='Children-testID-plus-one-cta']")
	WebElement child;
	
	@FindBy(xpath="//*[@data-testid='Infant-testID-plus-one-cta']")
	WebElement infant;
	
	@FindBy(xpath="//div[contains(text(),'Family & Friends')]")
	WebElement typesofPassengers;

	@FindBy(xpath="//*[contains(text(),'Search Flight')][1]")
	WebElement searchFlight;

	@FindBy(xpath="//*[@class='css-1dbjc4n r-18u37iz']//*[contains(text(),'Continue')]")
	WebElement continuebtn;

	public void roundWayTrip(String month1,String year1,String date1,String month2,String year2,String date2,int n,int m,int l) throws InterruptedException
	{	se1.actionClick(roundTrip);
		se1.actionClick(originClick);
		se1.actionClick(origin);
		se1.actionClick(departure);
		se1.calender(month1,year1,date1);
		se1.calender(month2, year2, date2);
		se1.actionClick(passenger);
		se1.roundTripGender(adult, child, infant, n,m,l);
		se1.actionClick(typesofPassengers);
		se1.actionClick(searchFlight);
		se1.waitForMeExplicit(continuebtn, 10);
		se1.screenshot("OneWayTrip");
		se1.actionClick(continuebtn);
		Thread.sleep(1000);

	}


}

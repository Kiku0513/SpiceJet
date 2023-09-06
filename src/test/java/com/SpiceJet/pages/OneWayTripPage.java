package com.SpiceJet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.utils.SeWrappers;

public class OneWayTripPage extends SeWrappers
{
	SeWrappers se1=new SeWrappers();
	@FindBy(xpath="//*[@data-testid='to-testID-origin']")
	WebElement originClick;
	
	@FindBy(xpath="//div[text()='Mumbai']")
	WebElement origin;
	
	@FindBy(xpath="//div[@class='css-1dbjc4n r-b5h31w r-95jzfe']//div[text()='Chennai']")
	WebElement departure;
	
	@FindBy(xpath="//*[@data-testid='home-page-travellers']")
	WebElement passenger;
	
	@FindBy(xpath="//*[@data-testid='Adult-testID-plus-one-cta']")
	WebElement adult;
	
	@FindBy(xpath="//*[contains(text(),'Search Flight')][1]")
	WebElement searchFlight;
	
	@FindBy(xpath="//*[@class='css-1dbjc4n r-18u37iz']//*[contains(text(),'Continue')]")
	WebElement continuebtn;
	
	@FindBy(xpath="//*[@data-testid='title-contact-detail-card']")
	WebElement title;

	@FindBy(xpath="//*[contains(text(),'Mrs')]")
	WebElement title1;

	@FindBy(xpath="//*[@data-testid='first-inputbox-contact-details']")
	WebElement fname;

	@FindBy(xpath="//*[@data-testid='last-inputbox-contact-details']")
	WebElement lname;

	@FindBy(xpath="//*[@data-testid='contact-number-input-box']")
	WebElement contactNo;


	@FindBy(xpath="//*[@data-testid='emailAddress-inputbox-contact-details']")
	WebElement email	;

	@FindBy(xpath="//*[@data-testid='city-inputbox-contact-details']")
	WebElement city;


	@FindBy(xpath="//div[@class='css-1dbjc4n']//div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-1otgn73']//div[@class='css-1dbjc4n r-zso239']")
	WebElement myselfClick;


	@FindBy(xpath="//*[contains(text(),'Next')]")
	WebElement nxtBttn;


	@FindBy(xpath="//*[@class='css-1dbjc4n r-1k9g4g2 r-z2wwpe r-rs99b7 r-15d164r r-1ufr4wv']//*[@data-testid='traveller-1-title-field']")
	WebElement UpArrow;


	@FindBy(xpath="//*[@data-testid='traveller-1-first-traveller-info-input-box']")
	WebElement  fname2;

	@FindBy(xpath="//*[@data-testid='traveller-1-last-traveller-info-input-box']")
	WebElement lname2;

	@FindBy(xpath="//*[@data-testid='sc-member-mobile-number-input-box']")
	WebElement mobNo2;

	@FindBy(xpath="//*[@data-testid='traveller-info-continue-cta']")
	WebElement continuebttn;
	
	public void oneWayTrip1(int n,String myCity,String firstName1,String lastName1,String phoneNo) throws InterruptedException
	{
	se1.actionClick(originClick);
	se1.actionClick(origin);
	se1.actionClick(departure);
	se1.calender("September", "2023", "23");
	se1.actionClick(passenger);
	se1.adultSel(adult, n);
	se1.actionClick(searchFlight);
	se1.screenshot("OneWayTrip");
	Thread.sleep(2000);
	se1.waitForMeExplicit(continuebtn, 10);
	se1.actionClick(continuebtn);
	se1.actionClick(title);
	se1.actionClick(title1);
	
	Thread.sleep(2000);
	
	se1.actionSendkeys(city, myCity);
	se1.actionClick(myselfClick);
	se1.click(nxtBttn);
	se1.jsClick(UpArrow);
	se1.sendkeys(fname2, firstName1);
	se1.actionSendkeys(lname2, lastName1);
	se1.sendkeys(mobNo2, phoneNo);
	se1.click(continuebttn);
	se1.addspop();

}
}
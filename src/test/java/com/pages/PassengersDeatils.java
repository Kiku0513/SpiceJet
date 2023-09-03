package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.SeWrappers;

public class PassengersDeatils  extends SeWrappers
{
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
	
	
	@FindBy(xpath="[@data-testid='emailAddress-inputbox-contact-details']")
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

	 SeWrappers se=new  SeWrappers();

	public void passengersDetails(String firstName,String lastName,String mobNo,String mailId,String myCity,String firstName1,String lastName1,String phoneNo)
	{
		se.actionClick(title);
		se.actionClick(title1);
		se.actionSendkeys(fname, firstName);
		se.actionSendkeys(lname, lastName);
		se.actionSendkeys(contactNo, mobNo);
		se.sendkeys(email, mailId);
		se.jsSendKeys(city, myCity);
		se.actionClick(myselfClick);
		se.click(nxtBttn);
		se.jsClick(UpArrow);
		se.sendkeys(fname2, firstName1);
		se.actionSendkeys(lname2, lastName1);
		se.sendkeys(mobNo2, phoneNo);
		se.click(continuebttn);
	}
	
	
	
	
}

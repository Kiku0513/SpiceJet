package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.SeWrappers;

public class OneWayTrip extends SeWrappers
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
	
	
	public void oneWayTrip1()
	{
	se1.actionClick(originClick);
	se1.actionClick(origin);
	se1.actionClick(departure);
	se1.calender("September", "2023", "23");
	se1.actionClick(passenger);
	se1.adultSel(adult);
	se1.actionClick(searchFlight);
	se1.waitForMeExplicit(continuebtn, 10);
	se1.actionClick(continuebtn);

}
}
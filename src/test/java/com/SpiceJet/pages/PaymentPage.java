package com.SpiceJet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.utils.SeWrappers;

public class PaymentPage  extends SeWrappers
{
	//dummy payment
	@FindBy(xpath="//iframe[@class='card_number_iframe']")
	WebElement FrameCard;
	@FindBy(xpath="//input[@id='card_number']")
	WebElement cardno;
	
	@FindBy(xpath="//*[@class='name_on_card_iframe']")
	WebElement frameName;
	@FindBy(xpath="//*[@placeholder='Cardholder Name']")
	WebElement cardname;
	
	@FindBy(xpath="//*[@class='card_exp_month_iframe']")
	WebElement frameMonth;
	@FindBy(xpath="//*[@placeholder='MM']")
	WebElement expmonth;
	
	@FindBy(xpath="//*[@class='card_exp_year_iframe']")
	WebElement frameYear;
	@FindBy(xpath="//*[@placeholder='YY']")
	WebElement expYear;
	
	@FindBy(xpath="//*[@class='security_code_iframe']")
	WebElement frameCvv;
	@FindBy(xpath="//*[@placeholder='123']")
	WebElement cvvNo;
	
	@FindBy(xpath="//*[@class='css-1dbjc4n r-2ka9w3 r-zr9zts']//*[contains(text(),'Proceed to pay')]")
	WebElement procedPayBtn;
	
	
	SeWrappers se=new SeWrappers();
	public void dummyPay(String cnum,String cname,String mon,String yr,String cvv) throws InterruptedException
	{   
		
		Thread.sleep(2000);
		
		se.frameByWebElement(FrameCard);
		se.typewithoutSendKeys(cardno,cnum);
		se.parent();
		se.frameByWebElement(frameName);
		se.actionSendkeys(cardname,cname);
		se.parent();
		se.frameByWebElement(frameMonth);
		se.actionSendkeys(expmonth,mon);
		se.parent();
		se.frameByWebElement(frameYear);
		se.actionSendkeys(expYear,yr);
		se.parent();
		se.frameByWebElement(frameCvv);
		se.actionSendkeys(cvvNo,cvv);
		se.parent();
		click(procedPayBtn);
	}
}

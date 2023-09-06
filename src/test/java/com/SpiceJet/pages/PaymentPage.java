package com.SpiceJet.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.utils.SeWrappers;

public class PaymentPage  extends SeWrappers
{
	//dummy payment
	@FindBy(xpath="//input[@id='card_number']")
	WebElement cardno;	
	@FindBy(xpath="//input[@id='name_on_card']")
	WebElement cardname;
	@FindBy(xpath="//input[@id='card_exp_month']")
	WebElement expmonth;
	@FindBy(xpath="//input[@id='card_exp_year']")
	WebElement expYear;
	@FindBy(xpath="//input[@id='security_code']")
	WebElement cvvNo;
	@FindBy(xpath="//*[@data-testid='common-proceed-to-pay']")
	WebElement procedPayBtn;

	SeWrappers se=new SeWrappers();
	public void dummyPay(String cnum,String cname,String mon,String yr,String cvv)
	{
		se.actionSendkeys(cardno,cnum);
		se.actionSendkeys(cardname,cname);
		se.actionSendkeys(expmonth,mon);
		se.actionSendkeys(expYear,yr);
		se.actionSendkeys(cvvNo,cvv);
		click(procedPayBtn);
	}
}

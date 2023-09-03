package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.SeWrappers;

public class LoginPage extends SeWrappers
{
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;

	@FindBy(xpath="//input[@data-testid='user-mobileno-input-box']")
	WebElement mobno;

	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement pass;

	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement loginButn;

	@FindBy(xpath="//div[text()='Hi Komal']")
	WebElement visiblename;

	SeWrappers se=new SeWrappers();
	public void loginDetails(String phoneNo,String pwd)
	{
	se.actionClick(login);
	se.actionSendkeys(mobno, phoneNo);	
	se.actionSendkeys(pass, pwd);
	se.click(loginButn);
	se.waitForMeExplicit(visiblename, 10);
}
}

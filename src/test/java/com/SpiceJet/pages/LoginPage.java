package com.SpiceJet.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.utils.SeWrappers;

public class LoginPage extends SeWrappers
{
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;

	@FindBy(xpath="//input[@type='number']")
	WebElement mobno;

	@FindBy(xpath="//input[@data-testid='password-input-box-cta']")
	WebElement pass;

	@FindBy(xpath="//div[@data-testid='login-cta']")
	WebElement loginButn;

	@FindBy(xpath="//div[text()='Hi Komal']")
	WebElement visiblename;

	SeWrappers se=new SeWrappers();
	public void loginDetails(String mobNo,String Password)
	{
	se.actionClick(login);
	se.actionSendkeys(mobno, mobNo);
	se.sendkeys(pass, Password);
	se.click(loginButn);
	
}
}

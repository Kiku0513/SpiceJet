package com.SpiceJet.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SpiceJet.utils.SeWrappers;

public class SignUpPage extends SeWrappers
{
	@FindBy(xpath="//div[contains(text(),'Signup')]")
	WebElement signUp;


	//WindowHandle

	//Select class
	@FindBy(xpath="//*[@class='form-control form-select ']")
	WebElement nickname;

	@FindBy(xpath="//input[@id='first_name']")
	WebElement firstName;

	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastName;

	@FindBy(xpath="//*[@class='form-control form-select']")
	WebElement country;

	//Use JavaScript

	@FindBy(xpath="//*[@id='dobDate']")
	WebElement calenderClick;

	@FindBy(xpath="//*[@aria-label='Choose Sunday, September 5th, 1993']")
	WebElement dateClick;
	
	//Select month
	@FindBy(xpath="//*[@class='react-datepicker__month-select']")
	WebElement month;

	@FindBy(xpath="//*[@class='react-datepicker__year-select']")
	WebElement year;
	
	
	//Actions class
	@FindBy(xpath="//input[@class=' form-control']")
	WebElement mobNo;


	@FindBy(xpath="//input[@id='email_id']")
	WebElement mailId;

	@FindBy(xpath="//input[@id='new-password']")
	WebElement newPass;


	@FindBy(xpath="//input[@id='c-password']")
	WebElement cPass;


	@FindBy(xpath="//*[@id='defaultCheck1']")
	WebElement checkButton;

	@FindBy(xpath="//*[contains(text(),'Submit')]")
	WebElement subButton;
	
	By loader1=By.className("modal-open");
	
	SeWrappers   se =new SeWrappers  ();
	public void signUp(String visibleText,String fname,String lname,String month2,String phone ,String mail,String nPass,String cnfPass) throws InterruptedException
	{ 

		click(signUp);
		switchWindows();
		selectByVisibleText(nickname, visibleText);
		Thread.sleep(1000);
	    se.waitForMeExplicit(firstName, 10);
		sendkeys(firstName,fname);
		sendkeys(lastName,lname);
		sendkeys(calenderClick,month2);
		Thread.sleep(1000);;;
		se.click(dateClick);
		Thread.sleep(2000);
		sendkeys(mobNo,phone);
		Thread.sleep(1000);
		sendkeys(mailId, mail);
		Thread.sleep(0);
		sendkeys(newPass, nPass);
		se.waitForMeExplicitwait(loader1, 5);
		actionSendkeys(cPass, cnfPass);
		Thread.sleep(1000);
		actionClick(checkButton);
		Thread.sleep(1000);
		se.doubleClick(subButton);
	}

	
}

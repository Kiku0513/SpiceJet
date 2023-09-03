package com.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.utils.SeWrappers;

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


	@FindBy(id="defaultCheck1")
	WebElement checkButton;

	@FindBy(xpath="//*[@class=' mt-40 px-sm-4 col-auto']")
	WebElement subButton;
	
	By loader1=By.className("modal-open");
	
	SeWrappers   se =new SeWrappers  ();
	public void signUp(String visibleText,String fname,String lname,String DOB,String phone ,String mail,String nPass,String cnfPass) throws InterruptedException
	{ 

		click(signUp);
		switchWindows();
		selectByVisibleText(nickname, visibleText);
	    se.waitForMeExplicit(firstName, 10);
		sendkeys(firstName,fname);
		sendkeys(lastName,lname);
		jsDownScroll(0,700);
		se.waitForMeExplicit(calenderClick, 10);
		click(calenderClick);
		sendkeys(calenderClick,DOB);
		se.waitForMeExplicitwait(loader1, 10);
		sendkeys(mobNo,phone);
		se.waitForMeExplicitwait(loader1, 10);
		sendkeys(mailId, mail);
		se.waitForMeExplicitwait(loader1, 10);
		sendkeys(newPass, nPass);
		se.waitForMeExplicitwait(loader1, 10);
		actionSendkeys(cPass, cnfPass);
		actionClick(checkButton);
		actionClick(subButton);
	}

	
}

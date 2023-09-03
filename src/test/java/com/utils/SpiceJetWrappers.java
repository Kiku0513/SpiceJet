package com.utils;

import org.openqa.selenium.support.PageFactory;
import com.pages.SignUpPage;
import com.utils.*;
import com.pages.OneWayTrip;
import com.pages.*;
public class SpiceJetWrappers extends SeWrappers 
{


	public void signpage(String visibleText,String fname,String lname,String DOB,String phone ,String mail,String nPass,String cnfPass)
	{

		try
		{
			SignUpPage sgnUp= PageFactory.initElements(driver, SignUpPage.class);
			sgnUp.signUp(visibleText,fname,lname,DOB,phone,mail,nPass,cnfPass);
			screenshot("SignUpPageOfSpiceJet");

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public void loginpageW(String phoneNo,String pwd)
	{
		try
		{
			LoginPage lognPage= PageFactory.initElements(driver, LoginPage.class);
		     lognPage.loginDetails(phoneNo,pwd);
		     screenshot("LoginPage");

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

	public void oneWay() 
	{
		try
		{
			OneWayTrip oneTrip= PageFactory.initElements(driver, OneWayTrip.class);
			oneTrip.oneWayTrip1();
			screenshot("OneWayTripScreenShot");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}


	public void passengers(String firstName,String lastName,String mobNo,String mailId,String myCity,String firstName1,String lastName1,String phoneNo)
	{
		try
		{
			PassengersDeatils passde= PageFactory.initElements(driver, PassengersDeatils.class);
			passde.passengersDetails(firstName,lastName,mobNo,mailId ,myCity,firstName1,lastName1,phoneNo);
			screenshot("PassenderDeatils");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}

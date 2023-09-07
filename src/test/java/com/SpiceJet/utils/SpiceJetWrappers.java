package com.SpiceJet.utils;

import org.openqa.selenium.support.PageFactory;

import com.SpiceJet.pages.*;
import com.SpiceJet.utils.*;
public class SpiceJetWrappers extends SeWrappers 
{

	public void fieldsAvailableCheck()
	{
		try
		{
			FieldsAvailablePage fdPage= PageFactory.initElements(driver, FieldsAvailablePage.class);
			fdPage.fieldsChecking();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

	public void signpage(String visibleText,String fname,String lname,String month2,String phone ,String mail,String nPass,String cnfPass)
	{

		try
		{
			SignUpPage sgnUp= PageFactory.initElements(driver, SignUpPage.class);
			sgnUp.signUp(visibleText,fname,lname,month2,phone,mail,nPass,cnfPass);
			screenshot("SignUpPageOfSpiceJet");

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}


	public void loginPage(String phoneNo,String pwd)
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

	public void oneWay(int n,String firstName,String lastName,String mobNo,String mailId,String myCity,String firstName1,String lastName1,String phoneNo) 
	{
		try
		{
			OneWayTripPage oneTrip= PageFactory.initElements(driver, OneWayTripPage.class);
			oneTrip.oneWayTrip1(n ,myCity,firstName1,lastName1,phoneNo);
           
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

		public void roundWay() 
		{
			try
			{
				RoundTripPage  rndTrip= PageFactory.initElements(driver, RoundTripPage .class);
				rndTrip.roundWayTrip("October", "2023","12", "October", "2023","17",1,2,1);
				screenshot("RoundsWayTripScreenShot");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}

	
	}
		public void paymentDummy(String cnum,String cname,String mon,String yr,String cvv) 
		{
			try
			{
				PaymentPage payPage= PageFactory.initElements(driver, PaymentPage   .class);
				payPage.dummyPay(cnum,cname,mon,yr,cvv);
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}

	
	}

}

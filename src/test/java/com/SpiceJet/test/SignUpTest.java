package com.SpiceJet.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;
import com.SpiceJet.utils.SpiceJetWrappers;

public class SignUpTest extends SeWrappers
{
	SeWrappers se=new SeWrappers();
			
	
	SpiceJetWrappers w3=new SpiceJetWrappers();
	
	@Test
	public void signUpWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("SignUp of SpiceJet functionality with valid credentials");
			launchBrowser();
			w3.signpage("Mrs","Komal","Nikame","09/05/1993","7350448434","komalnikame933@gmail.com","Flight@241222","Flight@241222");
		  
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while SignUp");

		}
	}
	@AfterMethod
	public void closeBrowser()
	{
		try
		{
			driver.	quit();
			Reports.reportStep("PASS", "Browser closed successfully");
		}
		catch(Exception ex)
		{
			System.out.println("Problem in closing the browser");
			Reports.reportStep("FAIL", "Problem in closing the browser");
			ex.printStackTrace();
		}
	}

}

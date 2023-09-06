package com.SpiceJet.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;
import com.SpiceJet.utils.SpiceJetWrappers;

public class NeagtiveTc_SignUp extends SeWrappers
{
	SpiceJetWrappers w3=new SpiceJetWrappers();
	SeWrappers se=new SeWrappers();
	@Test
	public void signUpWithInValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating SignUp of SpiceJet functionality with Invalid credentials");
			launchBrowser();
			w3.signpage("Mrs","123456677","Nikame","09/05/1993","7350448434","komalnikame933@gmail.com","Flight@241222","Flight@241222");
			se.screenshot("NegativeTC_InValidName");
			Assert.assertFalse(false);

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
			driver.close();
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

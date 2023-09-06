package com.SpiceJet.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;
import com.SpiceJet.utils.SpiceJetWrappers;

public class PayementSpiceJet extends SeWrappers
{

	SpiceJetWrappers sp=new SpiceJetWrappers();
	@Test
	public void paymentTest()
	{
		try
		{
			Reports.setTCDesc("Validating PaymentPage of SpiceJet functionality with dummy credentials");
			launchBrowser();
			sp.paymentDummy("1234567891012345", "komal", "08", "24" ,"087");
			String actual="Please enter a valid card";
			Assert.assertFalse(false, actual);

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Payment");
			Reports.reportStep("FAIL", "Problem while Payment");


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

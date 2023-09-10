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
	SeWrappers se=new SeWrappers();
	OneWayTest ow=new OneWayTest();
	SpiceJetWrappers sp=new SpiceJetWrappers();
	@Test(priority=5)
	public void paymentTest()
	{
		try
		{
			Reports.setTCDesc("Validating PaymentPage of SpiceJet functionality with dummy credentials");
			ow.oneWayTrip();
			sp.paymentDummy("5419190500936745", "komal", "11", "23" ,"382");
			se.screenshot("Payment");
		/*	String actual="Please enter a valid card";
			Assert.assertFalse(false, actual);
*/
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

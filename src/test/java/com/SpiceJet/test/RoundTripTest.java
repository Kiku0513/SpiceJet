package com.SpiceJet.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;
import com.SpiceJet.utils.SpiceJetWrappers;

public class RoundTripTest extends SeWrappers
{
	LoginTest_DataProvider lg=new LoginTest_DataProvider();
	SpiceJetWrappers sp=new SpiceJetWrappers();
	SeWrappers se=new SeWrappers();
	@Test(priority=4)
	public void roundTripVali()
	{
		try
		{
			Reports.setTCDesc(" RoundTrip of SpiceJet functionality ");
			se.launchBrowser();
			sp.roundWay();
	
	}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Validate RoundTrip");
			Reports.reportStep("FAIL", "Problem while RoundWayTrip in SpiceJet");


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



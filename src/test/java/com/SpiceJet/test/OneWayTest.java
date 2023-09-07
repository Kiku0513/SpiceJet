package com.SpiceJet.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;
import com.SpiceJet.utils.SpiceJetWrappers;

public class OneWayTest extends SeWrappers
{
	SpiceJetWrappers sp=new SpiceJetWrappers();
	LoginTest lg=new LoginTest();
	@Test
	public void oneWayTrip()
	{
		try
		{
			Reports.setTCDesc("OneWayTrip With Passenger Details of SpiceJet functionality");
			lg.loginWithValidCredentials();
			sp.oneWay(1,"Komal","Nikame","8208463464","komalnikame933@gmail.com","Pune","Ashish","Nikame","7350448722");
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Validate OneWayTrip With Passenger Details");
			Reports.reportStep("FAIL", "Problem while OneWayTrip");


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

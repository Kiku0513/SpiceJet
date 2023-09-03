package com.test;

import org.testng.annotations.Test;

import com.utils.Reports;
import com.utils.SeWrappers;
import com.utils.SpiceJetWrappers;

public class OneWayTest extends SeWrappers
{
	SpiceJetWrappers sp=new SpiceJetWrappers();
	@Test
	public void signUpWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating oneWayTrip of SpiceJet functionality with valid credentials");
			launchBrowser("https://www.spicejet.com");
			sp.oneWay();
			
			//  Assert.assertEquals(false, null)




		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while OneWayTrip");


		}
	}

}

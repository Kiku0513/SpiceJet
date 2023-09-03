package com.test;

import org.testng.annotations.Test;

import com.utils.Reports;
import com.utils.SeWrappers;
import com.utils.SpiceJetWrappers;

public class PassengersDeatilsTest extends SeWrappers
{

	SpiceJetWrappers sp=new SpiceJetWrappers();
	@Test
	public void signUpWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating Passengers Details of SpiceJet functionality with valid credentials");
		//	launchBrowser("https://www.spicejet.com");
			sp.passengers("Komal","Nikame","9421991882","KomalDhumale9333@gmail.com","Pune","Ashish","Nikame","7350448722");
			//  Assert.assertEquals(false, null)

			//firstName,lastName,mobNo,mailId ,myCity,firstName1,lastName1,phoneNo


		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while PassengerDetails");


		}
	}


}

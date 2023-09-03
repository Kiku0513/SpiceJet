package com.test;

import com.utils.SpiceJetWrappers;

import org.testng.annotations.Test;

import com.utils.Reports;
import com.utils.SeWrappers;

public class SignUpTest extends SeWrappers
{
	SpiceJetWrappers w3=new SpiceJetWrappers();
	@Test
	public void signUpWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating SignUp of SpiceJet functionality with valid credentials");
			launchBrowser("https://www.spicejet.com");
			w3.signpage("Mrs","Komal","Nikame","09/05/1993","7350448434","komalnikame933@gmail.com","Flight@241222","Flight@241222");
			//  Assert.assertEquals(false, null)




		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while SignUp");


		}
	}


}

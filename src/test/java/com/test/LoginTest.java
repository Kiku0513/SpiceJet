package com.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.utils.Reports;
import com.utils.SeWrappers;
import com.utils.SpiceJetWrappers;

public class LoginTest extends SeWrappers
{

	SpiceJetWrappers sp=new SpiceJetWrappers();
	@Test
	public void signUpWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating LoginPage of SpiceJet functionality with valid credentials");
			launchBrowser("https://www.spicejet.com");
			sp.loginpageW("9421991883","Kiku@0513");
			String actual="Hi Komal";
			String excep=driver.findElement(By.xpath("//div[text()='Hi Komal']")).getText();
			Assert.assertEquals(actual,excep);




		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while Login");


		}
	}
}

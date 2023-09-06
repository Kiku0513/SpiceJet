package com.SpiceJet.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;
import com.SpiceJet.utils.SpiceJetWrappers;

public class NegativeTc_Login extends SeWrappers

{
	SpiceJetWrappers sp=new SpiceJetWrappers();
	SeWrappers se=new SeWrappers();
	@Test
	public void loginWithInValidCredentials()
	{
		try
		{

			Reports.setTCDesc("Validating LoginPage of SpiceJet functionality with Invalid credentials");
			se.launchBrowser();
			sp.loginpageW("9991883","Kiku@0513");
			se.screenshot("Neg_Cred_LoginPage");
			driver.switchTo().defaultContent();
			se.navigateRefresh();
			sp.loginpageW("","Kiku@0513");
			se.screenshot("Neg_Cred_LoginPage_EmptyNo");
			driver.switchTo().defaultContent();
			se.navigateRefresh();
			sp.loginpageW("94219991883","");
			se.screenshot("Neg_Cred_LoginPage_EmptyPas");
			se.closeAllBrowsers();

		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to Login");
			Reports.reportStep("FAIL", "Problem while Login");


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

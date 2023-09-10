package com.SpiceJet.test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;
import com.SpiceJet.utils.SpiceJetWrappers;

public class FieldsAvailableTest  extends SeWrappers
{
	SpiceJetWrappers sp=new SpiceJetWrappers();
	
	@Test(priority=6)
	public void fieldsAvailableCheking()
	{
		try
		{
			Reports.setTCDesc("Fields Available of SpiceJet functionality ");
			launchBrowser();
			sp.fieldsAvailableCheck();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while FieldsAvailable Cheking");


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

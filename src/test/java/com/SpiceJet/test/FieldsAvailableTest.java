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
	
	@Test
	public void fieldsAvailableCheking()
	{
		try
		{
			Reports.setTCDesc("Validating Fields Available of SpiceJet functionality with valid credentials");
			launchBrowser("https://www.spicejet.com");
			sp.fieldsAvailableCheck();
			String actual="View / Manage Booking";
			String excep=driver.findElement(By.xpath("xpath=//div[text()='View / Manage Booking']")).getText();
			Assert.assertEquals(actual,excep);


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

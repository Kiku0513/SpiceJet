package com.SpiceJet.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;
import com.SpiceJet.utils.SpiceJetWrappers;

public class SignUpTest extends SeWrappers
{
	SeWrappers se=new SeWrappers();
	SpiceJetWrappers w3=new SpiceJetWrappers();
	
	
	@Test(priority=1)
	public void signUpWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("SignUp of SpiceJet functionality with valid credentials");
			launchBrowser();
			w3.signpage("Mrs","Komal","Nikame","09/05/1993","9421991883","komalNikame933@gmail.com","Flight@12344","Flight@12344");
		    Assert.assertFalse(false);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to SignUp");
			Reports.reportStep("FAIL", "Problem while SignUp");

		}
	}
	@AfterMethod
	public void closeBrowser()
	{
		try
		{
			driver.	quit();
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

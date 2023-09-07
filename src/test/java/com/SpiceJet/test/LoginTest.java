package com.SpiceJet.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;
import com.SpiceJet.utils.SpiceJetWrappers;

public class LoginTest extends SeWrappers
{

	SpiceJetWrappers sp=new SpiceJetWrappers();
	@Test
	public void loginWithValidCredentials()
	{
		try
		{
			
			Reports.setTCDesc("LoginPage of SpiceJet functionality with valid credentials");
			launchBrowser();
			sp.loginPage("9421991883","Kiku@0513");
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

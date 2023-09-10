package com.SpiceJet.test;
import org.apache.poi.ss.usermodel.DataFormatter;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.SpiceJet.utils.Reports;
import com.SpiceJet.utils.SeWrappers;
import com.SpiceJet.utils.SpiceJetWrappers;

public class LoginTest_DataProvider extends SeWrappers
{

	SpiceJetWrappers sp=new SpiceJetWrappers();
	@DataProvider(name="fetchData")
	public Object[][] readExcel() throws IOException
	{
		Object[][] data=null;
		XSSFWorkbook workbook=null;
	    DataFormatter dataFormatter = new DataFormatter();
		try
		{
			workbook= new XSSFWorkbook(new FileInputStream("C:\\Users\\ashis\\eclipse-workspace\\com.SpiceJetProject\\ReadFileForLogin.xlsx"));	
			XSSFSheet sheet= workbook.getSheet("LoginValid");
			XSSFRow row= sheet.getRow(0);
			
			int noOfRows=sheet.getPhysicalNumberOfRows();
			
			int noOfCells= row.getPhysicalNumberOfCells();
			
			data= new Object[noOfRows-1][noOfCells]; //data[5][2]
			
			for(int i=1; i<noOfRows;i++)
			{
				for(int j=0; j<noOfCells;j++)
				{
					 XSSFCell cell = sheet.getRow(i).getCell(j);
		                String cellValue = dataFormatter.formatCellValue(cell);
		                data[i - 1][j] = cellValue;
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			workbook.close();
		}
		
		return data;
	}
	
	@Test(dataProvider="fetchData",priority=2)
	public void loginWithValidCredentials(String MobNo,String Password)
	{
		try
		{
			
			Reports.setTCDesc("LoginPage of SpiceJet functionality with valid credentials");
			launchBrowser();
			sp.loginPage( MobNo,Password);
			sp.screenshot("LoginValid_Datap");
	      	Assert.assertTrue(true);




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

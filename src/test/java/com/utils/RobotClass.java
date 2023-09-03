package com.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RobotClass 
{ 
	static WebDriver driver=null;
	public void adds(By ele) throws InterruptedException
	{
	try {
		// Create a Robot instance
		Robot robot = new Robot();
		int targetX = 500; 
		int targetY = 300;   
		robot.mouseMove(targetX, targetY);

		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Press left mouse button
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); 
		Thread.sleep(5000);

		WebElement cl= driver.findElement(ele);
		cl.click();

	} 
	catch (AWTException e)
	{
		e.printStackTrace();
	}
	}
}

package com.project1.AddEmployee;


import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class CreateLoginDetails extends OrangeBase{
	
	public void clickButton() {
		
				driver.findElement(
						By.xpath(prop.getProperty("createloc")))
						.click();
	}
	public void loginDetails() {
					  try {
				driver.findElement(By.xpath(prop.getProperty("username1loc")))
						.sendKeys(prop.getProperty("Username1"));
				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("password1loc")))
						.sendKeys(prop.getProperty("Password1"));
				Thread.sleep(2000);
				driver.findElement(By.xpath(prop.getProperty("cpasswordloc")))
						.sendKeys(prop.getProperty("Cpassword"));
				Thread.sleep(2000);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}  
	  }
	  

}

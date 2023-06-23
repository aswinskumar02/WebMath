package com.project1.orangehrm;

import org.openqa.selenium.By;

public class LoginOrangeHrm extends OrangeBase {

	public void login() {

		driver.findElement(By.name(prop.getProperty("usernameloc"))).sendKeys(prop.getProperty("Username"));
		driver.findElement(By.name(prop.getProperty("passwordloc"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("submitloc"))).click();
	}

	public void invalidLogin() {

		driver.findElement(By.name(prop.getProperty("usernameloc"))).sendKeys(prop.getProperty("Invalidusername"));
		driver.findElement(By.name(prop.getProperty("passwordloc"))).sendKeys(prop.getProperty("Password"));
		driver.findElement(By.xpath(prop.getProperty("submitloc"))).click();
    }
	
	public void selectPIM() {
		try {
		driver.findElement(By.xpath(prop.getProperty("pimloc"))).click();
		Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
    }
	
	
}

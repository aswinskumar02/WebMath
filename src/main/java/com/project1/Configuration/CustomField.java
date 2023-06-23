package com.project1.Configuration;

import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class CustomField extends OrangeBase {
	
	public void selectoption() {
		driver.findElement(By.xpath(prop.getProperty("customfield"))).click();
	}

	public void addnew() {
		try {
		driver.findElement(By.xpath(prop.getProperty("addcustom"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("cusfieldloc"))).sendKeys(prop.getProperty("Fieldc"));

		driver.findElement(By.xpath(prop.getProperty("screenloc"))).click();

		driver.findElement(By.xpath(prop.getProperty("selectscreen"))).click();

		driver.findElement(By.xpath(prop.getProperty("typeloc"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(prop.getProperty("selecttype"))).click();
		Thread.sleep(2000);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}
	public void saveCustomField() {
		driver.findElement(By.xpath(prop.getProperty("savecustom"))).click();
		
	}
	public void resetField() {
		driver.findElement(By.xpath(prop.getProperty("cancelcustom"))).click();
		
	}
}

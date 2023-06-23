package com.project1.Configuration;

import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class ReportingMethod extends OrangeBase{
	

	public void selectReport() {
   driver.findElement(By.xpath(prop.getProperty("reporting"))).click();
}
	public void addnew() {
		driver.findElement(By.xpath(prop.getProperty("addnewreport"))).click();
		
		driver.findElement(By.xpath(prop.getProperty("addfield"))).sendKeys(prop.getProperty("reportmethod"));

	}
	public void saveReport() {
		driver.findElement(By.xpath(prop.getProperty("savereport1"))).click();
		
	}
	public void resetField() {
		driver.findElement(By.xpath(prop.getProperty("cancelreport1"))).click();
		
	}
}
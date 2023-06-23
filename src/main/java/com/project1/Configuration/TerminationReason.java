package com.project1.Configuration;

import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class TerminationReason extends OrangeBase {
	
	public void click() {
		driver.findElement(By.xpath(prop.getProperty("termination1"))).click();

	}
	public void addnew() {
		driver.findElement(By.xpath(prop.getProperty("addnewter"))).click();
		driver.findElement(By.xpath(prop.getProperty("reasonfieldloc")))
		.sendKeys(prop.getProperty("term"));	
	}
	public void save() {
		driver.findElement(By.xpath(prop.getProperty("savereason"))).click();
		
	}
	public void reset() {
		driver.findElement(By.xpath(prop.getProperty("cancelreason"))).click();
		
	}
}

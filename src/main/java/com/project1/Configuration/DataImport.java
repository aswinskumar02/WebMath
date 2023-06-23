package com.project1.Configuration;

import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class DataImport extends OrangeBase{
	
	public void clickDataImport() {
		driver.findElement(By.xpath(prop.getProperty("selectimport"))).click();

	}
	

}

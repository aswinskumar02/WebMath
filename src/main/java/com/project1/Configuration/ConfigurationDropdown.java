package com.project1.Configuration;

import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class ConfigurationDropdown extends OrangeBase {
	
	public void clickconfig() {
		
		driver.findElement(By.xpath(prop.getProperty("clickconfig"))).click();
	}

}

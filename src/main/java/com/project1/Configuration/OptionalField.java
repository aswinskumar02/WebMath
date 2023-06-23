package com.project1.Configuration;

import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class OptionalField extends OrangeBase{
	
	public void selectOptional() {
		try {
			driver.findElement(By.xpath(prop.getProperty("optionalfield")))
					.click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("saveoptional"))).click();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

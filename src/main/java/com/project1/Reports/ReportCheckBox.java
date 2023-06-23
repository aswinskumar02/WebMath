package com.project1.Reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project1.orangehrm.OrangeBase;

public class ReportCheckBox extends OrangeBase {
	
	public void selectCheckbox() {
		
	try {
		WebElement checkbox1 = driver.findElement(By.xpath(prop.getProperty("reportcheckbox")));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.xpath(prop.getProperty("reportcheckbox2")));
		checkbox2.click();
		Thread.sleep(3000);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
	public void checkboxDelete() {
		try {
			driver.findElement(By.xpath(prop.getProperty("deletebuttonloc"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("alertbox"))).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

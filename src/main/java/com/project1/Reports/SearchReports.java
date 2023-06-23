package com.project1.Reports;


import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class SearchReports extends OrangeBase {
	
	public void clickReport() {
		driver.findElement(By.xpath(prop.getProperty("reportoption"))).click();
	}

	public void fillValidReport() {
		try {
			driver.findElement(By.xpath(prop.getProperty("fieldloc"))).sendKeys(prop.getProperty("Reportsearch"));
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("selectdrop"))).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void fillInValidReport() {
		try {
			driver.findElement(By.xpath(prop.getProperty("fieldloc"))).sendKeys(prop.getProperty("invalidreport"));
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void searchButton() {
		driver.findElement(By.xpath(prop.getProperty("searchbuttonloc"))).click();
	}

	public void reset() {
		driver.findElement(By.xpath(prop.getProperty("resetloc"))).click();

	}

}

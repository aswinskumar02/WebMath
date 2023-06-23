package com.project1.Reports;

import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class AddNewReport extends OrangeBase {

	public void clickAddReport() {
		driver.findElement(By.xpath(prop.getProperty("clickaddloc"))).click();
	}

	public void addReport() {
		try {

			driver.findElement(By.xpath(prop.getProperty("reprtfieldloc"))).sendKeys(prop.getProperty("reportname"));
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("criterialoc"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("selectcriteria"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("includeloc"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("selectinclude"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("displayloc"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("selectgroup"))).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(prop.getProperty("display2loc"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("selectgroup2"))).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath(prop.getProperty("addto"))).click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void saveIt() {

		driver.findElement(By.xpath(prop.getProperty("savereport"))).click();
	}

	public void cancelIt() {

		driver.findElement(By.xpath(prop.getProperty("cancelreport"))).click();
	}
}
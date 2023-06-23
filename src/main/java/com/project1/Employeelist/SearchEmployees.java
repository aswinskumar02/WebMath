package com.project1.Employeelist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project1.orangehrm.OrangeBase;

public class SearchEmployees extends OrangeBase{
	public void employeewithValidcredential() {
		try {
			WebElement empname = driver.findElement(By.xpath(prop.getProperty("emp1loc")));
			WebElement emplastname = driver.findElement(By.xpath(prop.getProperty("emp1lastloc")));
			WebElement empid1 = driver.findElement(By.xpath(prop.getProperty("emp1idloc")));
			driver.findElement(By.xpath(prop.getProperty("empnameloc")))
					.sendKeys(empname.getText() + " " + emplastname.getText());
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("empidloc"))).sendKeys(empid1.getText());
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void employeewithInValidcredential() {
		try {

			driver.findElement(By.xpath(prop.getProperty("empnameloc"))).sendKeys(prop.getProperty("employeeName"));
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("empidloc"))).sendKeys(prop.getProperty("employeeId"));
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void resetButton() {
		driver.findElement(By.xpath(prop.getProperty("resetloc"))).click();
	}

	
	public void searchButton() {
		try {

			driver.findElement(By.xpath(prop.getProperty("searchloc"))).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

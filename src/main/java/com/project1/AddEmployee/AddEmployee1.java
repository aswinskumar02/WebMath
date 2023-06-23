package com.project1.AddEmployee;

import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class AddEmployee1 extends OrangeBase{
	public void addOption() {
		driver.findElement(By.xpath(prop.getProperty("addoptionloc"))).click();
	}

	public void addEmployee1() {
		try {

			driver.findElement(By.name(prop.getProperty("firstNameloc"))).sendKeys(prop.getProperty("Firstname"));
			Thread.sleep(2000);
			driver.findElement(By.name(prop.getProperty("middleNameloc"))).sendKeys(prop.getProperty("Middlename"));
			Thread.sleep(2000);
			driver.findElement(By.name(prop.getProperty("lastNameloc"))).sendKeys(prop.getProperty("Lastname"));
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void save() {
		try {
			driver.findElement(By.xpath(prop.getProperty("saveloc"))).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void cancel() {
		try {
			driver.findElement(By.xpath(prop.getProperty("cancelemploc"))).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	

}

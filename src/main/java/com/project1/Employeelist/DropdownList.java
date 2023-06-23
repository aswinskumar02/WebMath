package com.project1.Employeelist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.project1.orangehrm.OrangeBase;

public class DropdownList extends OrangeBase {
	
	public void employeeStatusDropdownTest() {
		try {
			for (int j = 0; j < 6; j++) {
				int position = j;
				List<WebElement> dropdowns = driver.findElements(By.className(prop.getProperty("dropdownloc")));
				dropdowns.get(0).click();
				for (int i = 0; i < position; i++) {
					dropdowns.get(0).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(1000);
				}
				dropdowns.get(0).sendKeys(Keys.ENTER);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void includeDropdownTest() {
		try {
			for (int j = 0; j < 3; j++) {
				int position = j;
				List<WebElement> dropdowns = driver.findElements(By.className(prop.getProperty("dropdownloc")));
				dropdowns.get(1).click();
				for (int i = 0; i < position; i++) {
					dropdowns.get(1).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(1000);
				}
				dropdowns.get(1).sendKeys(Keys.ENTER);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void jobDropdownTest() {
		try {
			for (int j = 0; j < 5; j++) {
				int position = j;
				List<WebElement> dropdowns = driver.findElements(By.className(prop.getProperty("dropdownloc")));
				dropdowns.get(2).click();
				for (int i = 0; i < position; i++) {
					dropdowns.get(2).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(1000);
				}
				dropdowns.get(2).sendKeys(Keys.ENTER);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void subunitDropdownTest() {
		try {
			for (int j = 0; j < 5; j++) {
				int position = j;
				List<WebElement> dropdowns = driver.findElements(By.className(prop.getProperty("dropdownloc")));
				dropdowns.get(3).click();
				for (int i = 0; i < position; i++) {
					dropdowns.get(3).sendKeys(Keys.ARROW_DOWN);
					Thread.sleep(1000);
				}
				dropdowns.get(3).sendKeys(Keys.ENTER);
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void supervisorNameTest() {
	
			driver.findElement(By.xpath(prop.getProperty("supervisorloc")))
					.sendKeys(prop.getProperty("supervisorname"));
			driver.findElement(By.xpath(prop.getProperty("supervisorselect")))
					.click();	
}
	
	
	
}
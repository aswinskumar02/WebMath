package com.project1.Employeelist;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.project1.orangehrm.OrangeBase;

public class CheckBoxSelection extends OrangeBase {

	public void checkBox() {
		
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			WebElement checkbox1 = driver.findElement(By.xpath(prop.getProperty("checkbox1loc")));
			checkbox1.click();
			WebElement checkbox2 = driver.findElement(By.xpath(prop.getProperty("checkbox2loc")));
			checkbox2.click();
	}

	public void checkboxDelete() {
		try {
			driver.findElement(By.xpath(prop.getProperty("reportdeleteloc"))).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath(prop.getProperty("alertloc"))).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
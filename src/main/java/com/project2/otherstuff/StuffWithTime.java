package com.project2.otherstuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.project2.Base.TestBasewebmath;

public class StuffWithTime extends TestBasewebmath {
	
	public void convertTime() {

		WebElement time = driver.findElement(By.xpath(prop.getProperty("timeloc")));
		time.click();
		WebElement time1 = driver.findElement(By.xpath(prop.getProperty("time1loc")));
		time1.sendKeys(prop.getProperty("Time"));
		Select unit = new Select(driver.findElement(
				By.xpath(prop.getProperty("dtimeloc"))));
		unit.selectByVisibleText(prop.getProperty("Timeunit"));
		WebElement timethem = driver.findElement(By.xpath(prop.getProperty("timebloc")));
		timethem.click();
	}

}

package com.project2.otherstuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class Metric extends TestBasewebmath{
	
	public void lbsIntokg() {

		WebElement metric = driver.findElement(By.xpath(prop.getProperty("metloc")));
		metric.click();
		WebElement metricnum1 = driver.findElement(By.xpath(prop.getProperty("met1loc")));
		metricnum1.sendKeys(prop.getProperty("pound"));
		WebElement metricthem = driver.findElement(By.xpath(prop.getProperty("metbloc")));
		metricthem.click();

	}

	public void kgIntolbs() {

		WebElement metric = driver.findElement(By.xpath(prop.getProperty("metloc")));
		metric.click();
		WebElement metricnum1 = driver.findElement(By.xpath(prop.getProperty("met2loc")));
		metricnum1.sendKeys(prop.getProperty("kilogram"));
		WebElement metricthem = driver.findElement(By.xpath(prop.getProperty("metbloc")));
		metricthem.click();

	}
	
	public void ozIntog() {

		WebElement metric = driver.findElement(By.xpath(prop.getProperty("metloc")));
		metric.click();
		WebElement metricnum1 = driver.findElement(By.xpath(prop.getProperty("met3loc")));
		metricnum1.sendKeys(prop.getProperty("ounces"));
		WebElement metricthem = driver.findElement(By.xpath(prop.getProperty("metbloc")));
		metricthem.click();

	}
}

package com.project2.fractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class CompareFraction extends TestBasewebmath{

	public void compare() {
		try {
			WebElement cfrntn = driver.findElement(By.xpath(prop.getProperty("cfracloc")));
			cfrntn.click();
			WebElement cfrntnnum1 = driver.findElement(By.xpath(prop.getProperty("cfrac1loc")));
			cfrntnnum1.sendKeys(prop.getProperty("FractionA"));
			WebElement cfrntnnum2 = driver.findElement(By.xpath(prop.getProperty("cfrac2loc")));
			cfrntnnum2.sendKeys(prop.getProperty("FractionB"));
			WebElement cfrntnnum3 = driver.findElement(By.xpath(prop.getProperty("cfrac3loc")));
			cfrntnnum3.sendKeys(prop.getProperty("FractionC"));
			WebElement cfrntnnum4 = driver.findElement(By.xpath(prop.getProperty("cfrac4loc")));
			cfrntnnum4.sendKeys(prop.getProperty("FractionD"));
			WebElement cfrntnthem = driver.findElement(By.xpath(prop.getProperty("cfracbloc")));
			cfrntnthem.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

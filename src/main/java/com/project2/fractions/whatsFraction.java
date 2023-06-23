package com.project2.fractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class whatsFraction extends TestBasewebmath{
	
	public void fraction() {
		try {
			WebElement wtfractn = driver.findElement(By.xpath(prop.getProperty("fracloc")));
			wtfractn.click();
			WebElement wtfractnnum1 = driver.findElement(By.xpath(prop.getProperty("frac1loc")));
			wtfractnnum1.sendKeys(prop.getProperty("Fraction1"));
			WebElement wtfractnnum2 = driver.findElement(By.xpath(prop.getProperty("frac2loc")));
			wtfractnnum2.sendKeys(prop.getProperty("Fraction2"));
			WebElement wtfractnthem = driver.findElement(By.xpath(prop.getProperty("fracbloc")));
			wtfractnthem.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

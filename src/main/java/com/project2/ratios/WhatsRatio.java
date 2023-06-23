package com.project2.ratios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class WhatsRatio extends TestBasewebmath {

	public void ratio1() {
		try {
			WebElement wtratio = driver.findElement(By.xpath(prop.getProperty("ratloc")));
			wtratio.click();
			WebElement wtrationum1 = driver.findElement(By.xpath(prop.getProperty("rat1loc")));
			wtrationum1.sendKeys(prop.getProperty("Ratio1"));
			WebElement wtrationum2 = driver.findElement(By.xpath(prop.getProperty("rat2loc")));
			wtrationum2.sendKeys(prop.getProperty("Ratio2"));
			Thread.sleep(2000);
			WebElement wtratiothem = driver.findElement(By.xpath(prop.getProperty("ratbloc")));
			wtratiothem.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void ratio2() {
		try {
			WebElement wtratio = driver.findElement(By.xpath(prop.getProperty("ratloc")));
			wtratio.click();
			WebElement wtrationum1 = driver.findElement(By.xpath(prop.getProperty("rat3loc")));
			wtrationum1.sendKeys(prop.getProperty("Ratio3"));
			WebElement wtrationum2 = driver.findElement(By.xpath(prop.getProperty("rat4loc")));
			wtrationum2.sendKeys(prop.getProperty("Ratio4"));
			Thread.sleep(2000);
			WebElement wtratiothem = driver.findElement(By.xpath(prop.getProperty("ratbloc")));
			wtratiothem.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

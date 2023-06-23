package com.project2.ratios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class Proportion extends TestBasewebmath{
	
	public void prop() {
		try {
		WebElement proptn = driver.findElement(By.xpath(prop.getProperty("proploc")));	
		proptn.click();
		WebElement proptnnum1 = driver.findElement(By.xpath(prop.getProperty("prop1loc")));
		proptnnum1.sendKeys(prop.getProperty("ProportionsA"));
		WebElement proptnnum2 = driver.findElement(By.xpath(prop.getProperty("prop2loc")));
		proptnnum2.sendKeys(prop.getProperty("ProportionsB"));
		WebElement proptnnum3 = driver.findElement(By.xpath(prop.getProperty("prop3loc")));
		proptnnum3.sendKeys(prop.getProperty("ProportionsC"));
		WebElement proptnnum4 = driver.findElement(By.xpath(prop.getProperty("prop4loc")));
		proptnnum4.sendKeys(prop.getProperty("ProportionsD"));
		WebElement proptnthem = driver.findElement(By.xpath(prop.getProperty("propbloc")));
		proptnthem.click();
		Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

package com.project2.numberbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class Numberline extends TestBasewebmath {

	public void clickNumberLine() {
		
		try {
		WebElement numline = driver.findElement(By.xpath(prop.getProperty("numlloc")));
		numline.click();
		WebElement numlinenum1 = driver.findElement(By.xpath(prop.getProperty("numl1loc")));
		numlinenum1.sendKeys(prop.getProperty("NumLine"));
		WebElement numlineshow = driver.findElement(By.xpath(prop.getProperty("numlbloc")));
		numlineshow.click();
		Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

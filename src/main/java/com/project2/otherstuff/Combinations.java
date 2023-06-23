package com.project2.otherstuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class Combinations extends TestBasewebmath {

	public void calcCombinations() {
		try {
			WebElement makingno = driver.findElement(By.xpath(prop.getProperty("combloc")));
			makingno.click();
			WebElement values = driver.findElement(By.xpath(prop.getProperty("comb1loc")));
			values.sendKeys(prop.getProperty("permutation"));
			WebElement showme = driver.findElement(By.xpath(prop.getProperty("combbloc")));
			showme.click();
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

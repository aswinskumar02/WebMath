package com.project2.numberbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class CompareNumber extends TestBasewebmath {

	public void clickCompareNum() {
		try {
			WebElement compnum = driver.findElement(By.xpath(prop.getProperty("comloc")));
			compnum.click();
			WebElement compnum1 = driver.findElement(By.xpath(prop.getProperty("com1loc")));
			compnum1.sendKeys(prop.getProperty("Num1comp"));
			WebElement compnum2 = driver.findElement(By.xpath(prop.getProperty("com2loc")));
			compnum2.sendKeys(prop.getProperty("Num2comp"));
			WebElement compnumshow = driver.findElement(By.xpath(prop.getProperty("comb1bloc")));
			compnumshow.click();
			Thread.sleep(2000);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

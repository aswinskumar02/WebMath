package com.project2.numberbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class Multiply extends TestBasewebmath{
	
	public void clickMultiply() {
		WebElement mul = driver.findElement(By.xpath(prop.getProperty("mulloc")));
		mul.click();
		WebElement mulnum1= driver.findElement(By.xpath(prop.getProperty("mul1loc")));
		mulnum1.sendKeys(prop.getProperty("Num1"));
		WebElement mulnum2 = driver.findElement(By.xpath(prop.getProperty("mul2loc")));
		mulnum2.sendKeys(prop.getProperty("Num2"));
		WebElement multhem = driver.findElement(By.xpath(prop.getProperty("mulbloc")));
		multhem.click();

	}

}

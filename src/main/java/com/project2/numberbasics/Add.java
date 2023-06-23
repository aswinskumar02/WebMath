package com.project2.numberbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class Add extends TestBasewebmath{
	
	public void clickAdd() {
		
		WebElement add = driver.findElement(By.xpath(prop.getProperty("addloc")));
		add.click();
		WebElement addnum1= driver.findElement(By.xpath(prop.getProperty("add1loc")));
		addnum1.sendKeys(prop.getProperty("Num1"));
		WebElement addnum2 = driver.findElement(By.xpath(prop.getProperty("add2loc")));
		addnum2.sendKeys(prop.getProperty("Num2"));
		WebElement addthem = driver.findElement(By.xpath(prop.getProperty("addbloc")));
		addthem.click();
	}
	
	

}

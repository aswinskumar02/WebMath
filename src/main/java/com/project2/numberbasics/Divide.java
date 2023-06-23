package com.project2.numberbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class Divide extends TestBasewebmath{
	
	public void clickDivide() {
		
		WebElement div = driver.findElement(By.xpath(prop.getProperty("divloc")));
		div.click();
		WebElement divnum1 = driver.findElement(By.xpath(prop.getProperty("div1loc")));
		divnum1.sendKeys(prop.getProperty("Divisor"));
		WebElement divnum2 = driver.findElement(By.xpath(prop.getProperty("div2loc")));
		divnum2.sendKeys(prop.getProperty("Dividend"));
		WebElement divthem = driver.findElement(By.xpath(prop.getProperty("divbloc")));
		divthem.click();
	}

}

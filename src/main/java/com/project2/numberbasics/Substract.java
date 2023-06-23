package com.project2.numberbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class Substract extends TestBasewebmath {
	
public void clickSub() {
		
		WebElement sub = driver.findElement(By.xpath(prop.getProperty("subloc")));
		sub.click();
		WebElement subnum1= driver.findElement(By.xpath(prop.getProperty("sub1loc")));
		subnum1.sendKeys(prop.getProperty("Num1"));
		WebElement subnum2 = driver.findElement(By.xpath(prop.getProperty("sub2loc")));
		subnum2.sendKeys(prop.getProperty("Num2"));
		WebElement subthem = driver.findElement(By.xpath(prop.getProperty("subbloc")));
		subthem.click();
	}


}

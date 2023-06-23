package com.project2.K8Math;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class SelectWhyWebMath extends TestBasewebmath{
	public void clickWhy() {
		WebElement whywebmath = driver.findElement(By.xpath(prop.getProperty("wwmloc")));
		whywebmath.click();
	}

}

package com.project2.quicksearchbar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class GoButton extends TestBasewebmath{
	
	public void clickGo() {
		WebElement go = driver.findElement(By.xpath(prop.getProperty("goloc")));
		go.click();
	}

}

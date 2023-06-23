package com.project2.K8Math;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class SelectHomeButton extends TestBasewebmath {
	
	public void clickHome() {
		
		WebElement homebtn = driver.findElement(By.xpath(prop.getProperty("homeloc")));
		homebtn.click();

	}

}

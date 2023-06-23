package com.project2.K8Math;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class SelectContact extends TestBasewebmath {
	
	public void clickContactUs() {
		WebElement contactus = driver.findElement(By.xpath(prop.getProperty("contactloc")));
		contactus.click();

	}

}

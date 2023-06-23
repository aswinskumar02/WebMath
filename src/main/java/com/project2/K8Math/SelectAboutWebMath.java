package com.project2.K8Math;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class SelectAboutWebMath extends TestBasewebmath {
	public void clickAbout() {
		WebElement aboutwebmath = driver.findElement(By.xpath(prop.getProperty("awmloc")));
		aboutwebmath.click();

	}

}

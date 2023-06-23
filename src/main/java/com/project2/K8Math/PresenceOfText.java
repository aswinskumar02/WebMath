package com.project2.K8Math;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class PresenceOfText extends TestBasewebmath {
	
	
	public void printText() {
		
		WebElement presencetext = driver.findElement(By.xpath(prop.getProperty("textloc")));
		System.out.println(presencetext.getText());
	}

}

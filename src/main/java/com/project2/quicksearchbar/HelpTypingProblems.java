package com.project2.quicksearchbar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class HelpTypingProblems extends TestBasewebmath{
	
	public void clickOn() {
		
		WebElement helptyping = driver.findElement(By.xpath(prop.getProperty("helploc")));
		helptyping.click();
	}

}

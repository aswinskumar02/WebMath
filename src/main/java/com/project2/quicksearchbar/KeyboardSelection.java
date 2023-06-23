package com.project2.quicksearchbar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class KeyboardSelection extends TestBasewebmath{
	
	public void selectFromKeyboard(){
		
		WebElement alphabet = driver.findElement(By.xpath(prop.getProperty("keyloc")));
		alphabet.sendKeys(prop.getProperty("word"));
	}

}

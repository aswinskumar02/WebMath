package com.project2.quicksearchbar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.project2.Base.TestBasewebmath;

public class ScrollDownDropdown  extends TestBasewebmath{
	
	public void scroll(){
		WebElement scroll  = driver.findElement(By.xpath(prop.getProperty("scrollloc")));
		Select select =  new Select(scroll);
		select.selectByVisibleText(prop.getProperty("textsh"));
	}

}

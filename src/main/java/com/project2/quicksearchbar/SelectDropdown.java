package com.project2.quicksearchbar;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.project2.Base.TestBasewebmath;

public class SelectDropdown extends TestBasewebmath {
	
	public void select() {
		Select dropdown = new Select(driver.findElement(By.xpath(prop.getProperty("droploc"))));
		dropdown.selectByValue(prop.getProperty("value"));
		driver.navigate().back();
	}
}

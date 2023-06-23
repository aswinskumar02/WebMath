package com.project1.Employeelist;

import org.openqa.selenium.By;

import com.project1.orangehrm.OrangeBase;

public class Addbutton extends OrangeBase{
	
	public void addButtonFromEmployeeList() {
	
			driver.findElement(By.xpath(prop.getProperty("addbuttonloc"))).click();

}
}
package com.project1.AddEmployee;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project1.orangehrm.OrangeBase;

public class AddImage extends OrangeBase{
	
	public void addEmployeeImage() {
		  try {
			  WebElement add = driver.findElement(
						By.xpath(prop.getProperty("addimageloc")));
				Thread.sleep(2000);
				File f = new File(
						"C:\\eclipse selenium1\\Testngdemo\\src\\main\\java\\com\\project1\\AddEmployee\\png-transparent-free-download-icon-cloud-down-computer-system-blue-computer-blue-laptop.png");
				System.out.println(f.getAbsolutePath());
				add.sendKeys(f.getAbsolutePath());

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}  
	  }

}

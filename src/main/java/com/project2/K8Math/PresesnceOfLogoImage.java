package com.project2.K8Math;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class PresesnceOfLogoImage extends TestBasewebmath{
	
	public void image() {
		WebElement logoimage = driver.findElement(By.xpath(prop.getProperty("logoloc")));
		System.out.println(logoimage.getAttribute("alt"));
	}

}

package com.project2.fractions;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;



public class PresenceUnderFraction  extends TestBasewebmath{
	
	public void print() {
		List<WebElement> allLinks = driver.findElements(By.xpath(prop.getProperty("link3loc")));
		Iterator<WebElement> itr = allLinks.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
	}

}

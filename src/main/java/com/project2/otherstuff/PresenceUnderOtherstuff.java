package com.project2.otherstuff;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class PresenceUnderOtherstuff extends TestBasewebmath{
	
	public void presence() {
		
		List<WebElement> allLinks = driver.findElements(By.xpath(prop.getProperty("link4loc")));
		Iterator<WebElement> itr = allLinks.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
	}

}

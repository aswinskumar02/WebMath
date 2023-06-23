package com.project2.numberbasics;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class PresenceUnderNumberBasics extends TestBasewebmath {
	
	public void checkPresence() {
		List<WebElement> allLinks = driver.findElements(By.xpath(prop.getProperty("link1loc")));
		Iterator<WebElement> itr = allLinks.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}
	}

}

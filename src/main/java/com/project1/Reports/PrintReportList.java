package com.project1.Reports;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project1.orangehrm.OrangeBase;

public class PrintReportList extends OrangeBase {
	
	public void printlist() {
		try {
			List<WebElement> allLinks = driver.findElements(By.xpath(prop.getProperty("reportlistloc")));
			Iterator<WebElement> itr = allLinks.iterator();
			while (itr.hasNext()) {
				System.out.println(itr.next().getText());
			}
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

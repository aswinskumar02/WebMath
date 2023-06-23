package com.project1.Employeelist;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project1.orangehrm.OrangeBase;

public class Printlist extends OrangeBase {
	public void printEmpList() {

		List<WebElement> allLinks = driver.findElements(By.xpath(prop.getProperty("emplistloc")));
		Iterator<WebElement> itr = allLinks.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().getText());
		}

	}

}

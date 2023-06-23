package com.project2.otherstuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.project2.Base.TestBasewebmath;

public class PracticeYourMath extends TestBasewebmath{
	
	public void Practice() {
		WebElement practice = driver.findElement(By.xpath(prop.getProperty("prbloc")));
		practice.click();
		Select type = new Select(driver.findElement(By.xpath(prop.getProperty("prbdloc"))));
		type.selectByVisibleText(prop.getProperty("Prbtype"));	
		WebElement prbnum = driver.findElement(By.xpath(prop.getProperty("prb1loc")));
		prbnum.sendKeys(prop.getProperty("Prbnum"));
		WebElement go = driver.findElement(By.xpath(prop.getProperty("prbbloc")));
		go.click();		
}

}

package com.project2.numberbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.project2.Base.TestBasewebmath;

public class Rounding extends TestBasewebmath {

	public void clickRound() {
		
		WebElement round = driver.findElement(By.xpath(prop.getProperty("rouloc")));
		round.click();
		WebElement roundnum1 = driver.findElement(By.xpath(prop.getProperty("rou1loc")));
		roundnum1.sendKeys(prop.getProperty("NumRound"));
		Select roundto = new Select(driver.findElement(By.xpath(prop.getProperty("roud"))));
		roundto.selectByVisibleText(prop.getProperty("numrow"));
		WebElement roundthem = driver.findElement(By.xpath(prop.getProperty("roubloc")));
		roundthem.click();
	}

}

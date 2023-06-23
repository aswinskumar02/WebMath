package com.project2.otherstuff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.project2.Base.TestBasewebmath;

public class Rectangles extends TestBasewebmath{
	
	public void calcRectangle() {
		
		WebElement rectangle = driver.findElement(By.xpath(prop.getProperty("recloc")));
		rectangle.click();
		WebElement width = driver.findElement(By.xpath(prop.getProperty("rec1loc")));
		width.sendKeys(prop.getProperty("width"));
		WebElement height = driver.findElement(By.xpath(prop.getProperty("rec2loc")));
		height.sendKeys(prop.getProperty("height"));

		Select munit = new Select(driver.findElement(By.xpath(prop.getProperty("drecloc"))));
		munit.selectByVisibleText(prop.getProperty("munit"));	
		WebElement area = driver.findElement(By.xpath(prop.getProperty("recbloc")));
		area.click();		
}

}

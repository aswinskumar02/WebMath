package com.project2.numberbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class PlaceValue extends TestBasewebmath{
	
	public void clickPlaceValue() {
		WebElement placeV = driver.findElement(By.xpath(prop.getProperty("plcloc")));
		placeV.click();
		WebElement placeVnum1 = driver.findElement(By.xpath(prop.getProperty("plc1loc")));
		placeVnum1.sendKeys(prop.getProperty("Numplace"));
		WebElement placeVthem = driver.findElement(By.xpath(prop.getProperty("plcbloc")));
		placeVthem.click();			
}


}

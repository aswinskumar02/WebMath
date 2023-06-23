package com.project2.K8Math;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.project2.Base.TestBasewebmath;

public class SelectK8 extends TestBasewebmath {

	public void k8Selection() {
		
		WebElement k8click = driver.findElement(By.xpath(prop.getProperty("k8loc")));
		k8click.click();
		
	}
}

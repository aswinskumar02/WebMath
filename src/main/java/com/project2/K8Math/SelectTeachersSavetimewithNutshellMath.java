package com.project2.K8Math;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.project2.Base.TestBasewebmath;

public class SelectTeachersSavetimewithNutshellMath extends TestBasewebmath {

	public void clickTeachersSave() {
		WebElement teacherssave = driver.findElement(By.xpath(prop.getProperty("tswloc")));
		teacherssave.click();
		driver.navigate().back();
	}

}

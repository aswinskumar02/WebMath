package com.project2.otherstufftest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.otherstuff.Rectangles;

public class RectanglesTest extends TestBasewebmath {
	SelectK8 sk;
	Rectangles rs;

	@Test
	public void rectangleArea() {
		sk.k8Selection();
		rs.calcRectangle();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		rs= new Rectangles();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
package com.project2.numberbasicstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.numberbasics.PlaceValue;

public class PlaceValueTest extends TestBasewebmath{
 
	SelectK8 sk;
	PlaceValue pv;
	
	@Test
	public void placeFunction() {
		sk.k8Selection();
		pv.clickPlaceValue();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		pv = new PlaceValue();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}

package com.project2.fractionstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.fractions.CompareFraction;

public class CompareFractionTest  extends TestBasewebmath{
	SelectK8 sk;
	CompareFraction cf;
	
	@Test
	public void compareFractionFunction() {
		sk.k8Selection();
		cf.compare();
		
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		cf = new CompareFraction();
		
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}

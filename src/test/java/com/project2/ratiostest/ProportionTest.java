package com.project2.ratiostest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.ratios.Proportion;

public class ProportionTest extends TestBasewebmath {
	SelectK8 sk;
	Proportion pr;
	
	@Test
	public void select() {
		sk.k8Selection();
		pr.prop();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		pr = new Proportion();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
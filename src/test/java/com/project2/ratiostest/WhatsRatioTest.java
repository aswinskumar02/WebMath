package com.project2.ratiostest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.ratios.WhatsRatio;


public class WhatsRatioTest extends TestBasewebmath{
	SelectK8 sk;
	WhatsRatio wr;
	
	@Test
	public void ratioFunction1() {
		sk.k8Selection();
		wr.ratio1();
	}

	@Test
	public void ratioFunction2() {
		sk.k8Selection();
		wr.ratio2();
	}
	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		wr = new WhatsRatio();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}

package com.project2.fractionstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.fractions.PresenceUnderFraction;

public class PresenceUnderFractionTest extends TestBasewebmath {
	SelectK8 sk;
	PresenceUnderFraction pf;
	
	@Test
	public void presence() {
		sk.k8Selection();
		pf.print();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		pf = new PresenceUnderFraction();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}

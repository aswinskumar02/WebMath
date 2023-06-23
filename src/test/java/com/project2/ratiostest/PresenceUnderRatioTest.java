package com.project2.ratiostest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.ratios.PresenceUnderRatio;

public class PresenceUnderRatioTest extends TestBasewebmath {
	SelectK8 sk;
	PresenceUnderRatio pu;

	@Test
	public void select() {
		sk.k8Selection();
		pu.presence();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		pu = new PresenceUnderRatio();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
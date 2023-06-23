package com.project2.k8mathtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.PresenceOfText;
import com.project2.K8Math.SelectK8;

public class PresenceOfTextTest extends TestBasewebmath {
	PresenceOfText pt;
	SelectK8 sk;

	@Test
	public void PresenceOfTextKinder() {
		sk.k8Selection();
		pt.printText();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		pt = new PresenceOfText();
		sk = new SelectK8();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}

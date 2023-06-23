package com.project2.numberbasicstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.numberbasics.PresenceUnderNumberBasics;

public class PresenceUnderNumberBasicsTest extends TestBasewebmath {

	SelectK8 sk;
	PresenceUnderNumberBasics pn;

	@Test
	public void presenceOfText() {
		sk.k8Selection();
		pn.checkPresence();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		pn = new PresenceUnderNumberBasics();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
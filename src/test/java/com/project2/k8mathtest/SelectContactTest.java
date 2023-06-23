package com.project2.k8mathtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectContact;
import com.project2.K8Math.SelectK8;

public class SelectContactTest extends TestBasewebmath {
	SelectK8 sk;
	SelectContact sc;

	@Test
	public void select() {
		sk.k8Selection();
		sc.clickContactUs();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		sc = new SelectContact();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
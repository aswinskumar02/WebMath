package com.project2.k8mathtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectAboutWebMath;
import com.project2.K8Math.SelectK8;

public class SelectAboutWebMathTest extends TestBasewebmath {
	SelectK8 sk;
	SelectAboutWebMath saw;

	@Test
	public void select() {
		sk.k8Selection();
		saw.clickAbout();

	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		saw = new SelectAboutWebMath();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
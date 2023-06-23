package com.project2.k8mathtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.K8Math.SelectWhyWebMath;

public class SelectWhyWebMathTest extends TestBasewebmath {
	SelectK8 sk;
	SelectWhyWebMath sww;

	@Test
	public void select() {
		sk.k8Selection();
		sww.clickWhy();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		sww = new SelectWhyWebMath();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}

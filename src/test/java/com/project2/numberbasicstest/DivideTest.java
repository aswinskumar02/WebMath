package com.project2.numberbasicstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.numberbasics.Divide;

public class DivideTest extends TestBasewebmath {
 
	SelectK8 sk;
	Divide div;

	@Test
	public void divFunction() {
		sk.k8Selection();
		div.clickDivide();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		div = new Divide();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
package com.project2.numberbasicstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.numberbasics.Substract;

public class SubstractTest extends TestBasewebmath {
 
	SelectK8 sk;
	Substract sb;
	
	@Test
	public void subFunction() {
		sk.k8Selection();
		sb.clickSub();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		sb = new Substract();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
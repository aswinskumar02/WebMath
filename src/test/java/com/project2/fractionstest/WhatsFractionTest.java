package com.project2.fractionstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.fractions.whatsFraction;

public class WhatsFractionTest extends TestBasewebmath {
	SelectK8 sk;
	whatsFraction wf;
	@Test
	public void fractionFunction() {
		sk.k8Selection();
		wf.fraction();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		wf = new whatsFraction();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}

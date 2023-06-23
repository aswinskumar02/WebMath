package com.project2.numberbasicstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.numberbasics.Rounding;

public class RoundingTest  extends TestBasewebmath {
  
	SelectK8 sk;
    Rounding r;
    
	@Test
	public void roundFunction() {
		sk.k8Selection();
		r.clickRound();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		r = new  Rounding();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
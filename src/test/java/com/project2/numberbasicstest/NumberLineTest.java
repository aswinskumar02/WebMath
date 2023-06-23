package com.project2.numberbasicstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.numberbasics.Numberline;

public class NumberLineTest extends TestBasewebmath {
  
	SelectK8 sk;
	Numberline nl;
	
	@Test
	public void numlineFunction() {
		sk.k8Selection();
		nl.clickNumberLine();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		nl =  new Numberline();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
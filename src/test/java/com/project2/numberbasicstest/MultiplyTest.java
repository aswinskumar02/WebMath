package com.project2.numberbasicstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.numberbasics.Multiply;

public class MultiplyTest extends TestBasewebmath{
	
	SelectK8 sk;
	Multiply mt;
	
	@Test
	public void mulFunction() {
		sk.k8Selection();
		mt.clickMultiply();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		mt =  new  Multiply();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
package com.project2.numberbasicstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.numberbasics.Add;

public class AddTest extends TestBasewebmath{
	SelectK8 sk;
	Add ad;
	
	@Test
	public void addFunction() {
		sk.k8Selection();
		ad.clickAdd();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		ad = new Add();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
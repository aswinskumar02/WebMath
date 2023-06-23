package com.project2.numberbasicstest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.numberbasics.CompareNumber;

public class CompareNumberTest extends TestBasewebmath {

	SelectK8 sk;
	CompareNumber cn;

	@Test
	public void compareFunction() {
		sk.k8Selection();
		cn.clickCompareNum();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		cn = new CompareNumber();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}


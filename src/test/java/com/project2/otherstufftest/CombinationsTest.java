package com.project2.otherstufftest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.otherstuff.Combinations;

public class CombinationsTest extends TestBasewebmath {
	SelectK8 sk;
	 Combinations cn;
	@Test
	public void permutation() {
		sk.k8Selection();
		cn.calcCombinations();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		cn =  new  Combinations();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
package com.project2.otherstufftest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.otherstuff.Metric;

public class MetricTest extends TestBasewebmath {
	SelectK8 sk;
	Metric m;
	
	@Test
	public void poundIntoKilograms() {
		sk.k8Selection();
		m.lbsIntokg();
	}
	@Test
	public void kilogramsIntoPound() {
		sk.k8Selection();
		m.kgIntolbs();
	}
	@Test
	public void ouncesIntoGrams() {
		sk.k8Selection();
		m.ozIntog();
	}
	

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		m = new Metric();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
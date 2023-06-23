package com.project2.otherstufftest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.otherstuff.StuffWithTime;


public class StuffWithTimeTest extends TestBasewebmath{
	SelectK8 sk;
	StuffWithTime sw;
	
	@Test
	public void timeConvertion() {
		sk.k8Selection();
		sw.convertTime();

	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
	    sw= new StuffWithTime();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
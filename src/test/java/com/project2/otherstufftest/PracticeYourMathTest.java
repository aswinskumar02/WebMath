package com.project2.otherstufftest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;

import com.project2.otherstuff.PracticeYourMaths;

public class PracticeYourMathTest extends TestBasewebmath {
	SelectK8 sk;
	PracticeYourMaths pym;
	@Test
	public void praticeMath() {
		sk.k8Selection();
		pym.practice();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		pym = new PracticeYourMaths();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
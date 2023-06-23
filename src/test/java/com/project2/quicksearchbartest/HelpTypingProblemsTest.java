package com.project2.quicksearchbartest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.quicksearchbar.HelpTypingProblems;

public class HelpTypingProblemsTest  extends TestBasewebmath{
	SelectK8 sk;
	 HelpTypingProblems hp;
	 
	@Test
	public void select() {
		sk.k8Selection();
		hp.clickOn();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		hp = new  HelpTypingProblems();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}

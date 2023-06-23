package com.project2.quicksearchbartest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.quicksearchbar.GoButton;

public class GoButtonTest extends TestBasewebmath{
  
	SelectK8 sk;
	GoButton gb;
	
	@Test
	public void select() {
		sk.k8Selection();
		gb.clickGo();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		gb= new GoButton();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
package com.project2.quicksearchbartest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.quicksearchbar.KeyboardSelection;

public class KeyboardSelectionTest extends TestBasewebmath{
  
	SelectK8 sk;
	KeyboardSelection ks;
	
	@Test
	public void select() {
		sk.k8Selection();
		ks.selectFromKeyboard();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		ks = new KeyboardSelection();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
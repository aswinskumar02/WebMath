package com.project2.quicksearchbartest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.quicksearchbar.SelectDropdown;

public class SelectDropdownTest extends TestBasewebmath {
	SelectK8 sk;
	SelectDropdown sd;

	@Test
	public void select() {
		sk.k8Selection();
		sd.select();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		sd = new SelectDropdown();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
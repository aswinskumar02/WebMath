package com.project2.quicksearchbartest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.quicksearchbar.ScrollDownDropdown;

public class ScrollDownDropdownTest extends TestBasewebmath {
 
	SelectK8 sk;
	ScrollDownDropdown sdd;
	
	@Test
	public void scrollAndSelect() {
		sk.k8Selection();
		sdd.scroll();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		sdd = new ScrollDownDropdown();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
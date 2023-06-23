package com.project1.orangehrmtest;

import org.testng.annotations.Test;

import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class LoginOrangeTest extends OrangeBase {

	LoginOrangeHrm lo;

	@Test
	public void validLogin() {
		lo.login();
	}

	@Test
	public void invalidLogin() {
		lo.invalidLogin();
	}

	@Test
	public void selectPim() {
		lo.login();
		lo.selectPIM();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}

}

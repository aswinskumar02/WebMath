package com.project2.k8mathtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectHomeButton;
import com.project2.K8Math.SelectK8;

public class SelectHomeButtonTest extends TestBasewebmath {
	SelectK8 sk;
	SelectHomeButton shb;
	
	  @Test
	  public void select() {
		  sk.k8Selection();
		  shb.clickHome();
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  intialization();  
		  sk = new SelectK8(); 
		  shb= new SelectHomeButton();
	  }
	  
	  @AfterMethod
	  public void afterMethod() {
		  close();
		  
	  }
	}

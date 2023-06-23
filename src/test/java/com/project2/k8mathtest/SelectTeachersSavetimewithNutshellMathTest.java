package com.project2.k8mathtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.K8Math.SelectTeachersSavetimewithNutshellMath;

public class SelectTeachersSavetimewithNutshellMathTest extends TestBasewebmath {
	SelectK8 sk;
	SelectTeachersSavetimewithNutshellMath stt;

	@Test
	public void select() {
		sk.k8Selection();
		stt.clickTeachersSave();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		stt = new SelectTeachersSavetimewithNutshellMath();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}
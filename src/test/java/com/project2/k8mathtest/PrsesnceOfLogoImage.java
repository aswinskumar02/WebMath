package com.project2.k8mathtest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.PresesnceOfLogoImage;
import com.project2.K8Math.SelectK8;

public class PrsesnceOfLogoImage extends TestBasewebmath {
	SelectK8 sk;
	PresesnceOfLogoImage pl;

	@Test
	public void printTextImage() {
		sk.k8Selection();
		pl.image();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		pl = new PresesnceOfLogoImage();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}

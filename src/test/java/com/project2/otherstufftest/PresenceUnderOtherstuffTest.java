package com.project2.otherstufftest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project2.Base.TestBasewebmath;
import com.project2.K8Math.SelectK8;
import com.project2.otherstuff.PresenceUnderOtherstuff;

public class PresenceUnderOtherstuffTest extends TestBasewebmath {
	SelectK8 sk;
	PresenceUnderOtherstuff ps;
	
	@Test
	public void  presenceOfText() {
		sk.k8Selection();
		ps.presence();
	}

	@BeforeMethod
	public void beforeMethod() {
		intialization();
		sk = new SelectK8();
		ps = new PresenceUnderOtherstuff();
	}

	@AfterMethod
	public void afterMethod() {
		close();

	}
}


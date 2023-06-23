package com.project1.ReportTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Reports.AddNewReport;
import com.project1.Reports.SearchReports;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class AddNewReportTest extends OrangeBase {
	LoginOrangeHrm lo;
	AddNewReport anr;
	SearchReports sr;

	@Test
	public void addNew() {
		sr.clickReport();
		anr.clickAddReport();
		anr.addReport();
		anr.saveIt();
	}

	@Test
	public void cancelField() {
		sr.clickReport();
		anr.clickAddReport();
		anr.addReport();
		anr.cancelIt();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		anr = new AddNewReport();
		sr = new SearchReports();
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}
}

package com.project1.ReportTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Reports.PrintReportList;
import com.project1.Reports.SearchReports;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class PrintReportListTest extends OrangeBase{
	LoginOrangeHrm lo;
	SearchReports sr;
	PrintReportList prt;
	
  @Test
  public void printReport() {
	  sr.clickReport();
	  prt.printlist();
	  
  }
  @BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		sr =new SearchReports();
		prt=new PrintReportList();
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}
}

package com.project1.ReportTest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project1.Reports.SearchReports;
import com.project1.orangehrm.LoginOrangeHrm;
import com.project1.orangehrm.OrangeBase;

public class SearchReportsTest extends OrangeBase {
	LoginOrangeHrm lo;
	SearchReports sr;
	
  @Test
  public void searchValidReport() {
	  sr.clickReport();
	  sr.fillValidReport();
	  sr.searchButton();
  }
  
  @Test
  public void searchInValidReport() {
	  sr.clickReport();
	  sr.fillInValidReport();
	  sr.searchButton();
  }
  
  @Test
  public void reset() {
	  searchInValidReport();
	  sr.reset();
  }
  
  
  @BeforeMethod
	public void beforeMethod() {
		intialization();
		lo = new LoginOrangeHrm();
		sr =new SearchReports();
		lo.login();
		lo.selectPIM();
	}

	@AfterMethod
	public void afterMethod() {
		close();
	}
}

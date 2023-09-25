package com.pattern.structural.facade;

public class FacadePatternTest {
	
	public static void main(String[] args) {
		HelperFacade.generateReport(HelperFacade.DBTypes.MYSQL, HelperFacade.ReportTypes.HTML, "user");
		HelperFacade.generateReport(HelperFacade.DBTypes.ORACLE, HelperFacade.ReportTypes.PDF, "user");
	}
}

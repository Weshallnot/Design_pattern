package com.pattern.structural.facade;

import java.sql.Connection;

public class MySQLHelper {
	
	public static Connection getMysqlConnection() {
		return null;
	}
	
	public void generateMysqlPDFReport(String tableName, Connection con) {
		System.out.println("MySQL::PDF report");
	}
	
	public void generateMySqlHTMLReport(String tableName, Connection con) {
		System.out.println("MySQL::HTML report");
	}
}

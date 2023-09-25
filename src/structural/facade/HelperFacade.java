package com.pattern.structural.facade;

import java.sql.Connection;

public class HelperFacade {
	
	public static void generateReport(DBTypes dbType, ReportTypes reportType, String tableName) {
		
		Connection con = null;
		switch (dbType) {
		case MYSQL:
			con = MySQLHelper.getMysqlConnection();
			MySQLHelper sqlHelper = new MySQLHelper();
			switch (reportType) {
			case HTML:
				sqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				sqlHelper.generateMysqlPDFReport(tableName, con);
			default:
				break;
			}
			break;
		case ORACLE:
			con = OracleHelper.getOracleDBConnection();
			OracleHelper oracleHelper = new OracleHelper();
			switch (reportType) {
			case HTML:
				oracleHelper.generateOracleHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateOraclePDFReport(tableName, con);
				break;
			default:
				break;
			}
		default:
			break;
		}
	}
	
	public static enum DBTypes {
		MYSQL,
		ORACLE
	}
	
	public static enum ReportTypes {
		HTML,
		PDF
	}
}

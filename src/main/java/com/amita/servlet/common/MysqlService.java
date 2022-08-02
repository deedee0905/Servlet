package com.amita.servlet.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MysqlService {
	
	private static MysqlService mysqlSerive = null;
	
	// url, userId, password
	
	private final String url  = "jdbc:mysql://localhost:3306/dulumary_0707";
	private final String userId = "root";
	private final String password ="mycording123!";
	private Connection connection;
	private Statement statement;
	
	// 객체를 얻어갈 수 있는 메소드
	public static MysqlService getInstance() {
	if(mysqlSerive == null) {
		mysqlSerive = new MysqlService();
	}
	return mysqlSerive;
	
	}
	
	
	// 접속기능, (select 쿼리 수행기능) (insert update delete 쿼리 수행기능), 접속해제 기능
	
	public void connect() {
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			
			// 접속 주소, 아이디, 패스워드
			
			String url = "jdbc:mysql://localhost:3306/dulumary_0707";
			String userId = "root";
			String password ="mycording123!";
			
			this.connection =  DriverManager.getConnection(this.url, this.userId, this.password);
			this.statement = connection.createStatement();
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	//
	}
	
	// 셀렉트 쿼리 수행 기능
	public ResultSet select(String query) {
		try {
			return this.statement.executeQuery(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
			return null;
		}
	}
	
	
	// 인서트, 업데이트, 딜리트 쿼리 수행 기능
	
	public int update(String query) {
		try {
			return this.statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
			return -1;
		}
	}
	
	// 잡석 해제 기능
	public void disConnect() {
		try {
			this.connection.close();
			this.statement.close();
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}
		
	
	}
	
	

	//
}

package com.project.foodDamas;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class TestMariaDBConnect {
	private static final String DRIVER = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://127.0.0.1:3307/foodtruck";
	private static final String USER = "foodDamas"; 
	private static final String PW = "12345"; 
	@Test
	public void testConnection() throws Exception{
		Class.forName(DRIVER);
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println(con);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

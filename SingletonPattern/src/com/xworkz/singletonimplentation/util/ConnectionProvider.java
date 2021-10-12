package com.xworkz.singletonimplentation.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionProvider {
	private static Connection connection = null;

	static {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Laptop", "root","ganeshmp");
			System.out.println("connection is suceesfull");
			System.out.println("Connection is Singleton");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
	}
	public static Connection getConnection() {
		System.out.println("Invoked getConnection()");
		if(connection!=null) {
			return connection;
		}else {
			System.out.println("Connection is not created");
			return connection;
		}
	}

	public static void closeConnection() {
		try {
			if(connection!=null) {
				connection.close();
				System.out.println("Connection is closed");
			}else {
				System.out.println("Connection is not closed");
			}
		}
		catch(SQLException e) {
		}

	}
}




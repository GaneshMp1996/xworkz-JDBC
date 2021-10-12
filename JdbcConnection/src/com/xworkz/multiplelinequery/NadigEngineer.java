package com.xworkz.multiplelinequery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NadigEngineer {
	public static void main(String[] args)  {
	String url = "jdbc:mysql://localhost:3306/nadig_engineers";
	String userName = "root";
	String password = "ganeshmp";
	String readAllRecord = "SELECT * FROM site_engineers";
	Connection connection = null;
	
	try {
		connection = DriverManager.getConnection(url, userName, password);
		System.out.println("connection is suceesfull" + url);
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(readAllRecord);
		//boolean isRowPresent = resultSet.next();
		//while(isRowPresent)
		while(resultSet.next()) {
			System.out.println("id "+ resultSet.getInt(1));
			System.out.println("username "+ resultSet.getString(2));
			System.out.println("Gender "+ resultSet.getString(3));
			System.out.println("branch "+ resultSet.getString(4));
			System.out.println("salary "+ resultSet.getInt(5));
			System.out.println("location "+ resultSet.getString(6));
			System.out.println("phone number "+ resultSet.getBigDecimal(7));
			System.out.println("Data Readed  Sucessfully");
		}
	}catch (SQLException sqlException) {
		System.out.println("Inside catch black Exception");
		System.out.println(sqlException.getMessage());
		sqlException.printStackTrace();
	}
	finally {
		if(connection != null) {
			System.out.println("connection closed");
			System.out.println("------------------");
		}
		else {
			System.out.println("connection is not closed");
		}

}

}
}


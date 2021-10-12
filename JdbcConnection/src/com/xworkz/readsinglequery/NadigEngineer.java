package com.xworkz.readsinglequery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class NadigEngineer {
	public static void main(String[] args)  {

		String url="jdbc:mysql://localhost:3306/nadig_engineers";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection=null;
		String readSingleRecordQuery = "select * from site_engineers where id=1";


		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			ResultSet resultSet=statement.executeQuery(readSingleRecordQuery);
			resultSet.next(); 
			System.out.println("id "+ resultSet.getInt(1));
			System.out.println("username "+ resultSet.getString(2));
			System.out.println("Gender "+ resultSet.getString(3));
			System.out.println("branch "+ resultSet.getString(4));
			System.out.println("salary "+ resultSet.getInt(5));
			System.out.println("location "+ resultSet.getString(6));
			System.out.println("phone number "+ resultSet.getBigDecimal(7));
			System.out.println("Data Readed  Sucessfully");

		}catch(SQLException e) {

			System.out.println(e.getMessage());
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

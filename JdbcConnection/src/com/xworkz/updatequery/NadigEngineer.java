package com.xworkz.updatequery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NadigEngineer {
	public static void main(String[] args)  {

		String url="jdbc:mysql://localhost:3306/nadig_engineers";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection=null;
		 String updateQuery = "update site_engineers set Salary='60000' where id =1";;


		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);
			System.out.println("Data Updated  Sucessfully");

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

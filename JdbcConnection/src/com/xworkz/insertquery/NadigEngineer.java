package com.xworkz.insertquery;
import java.sql.*;
public class NadigEngineer {
	public static void main(String[] args)  {

		String url="jdbc:mysql://localhost:3306/nadig_engineers";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection=null;
		String insertQuery = "INSERT INTO site_engineers values(8,'Mahesh','M','Gulberga','40000','Gadag','9184535261')";


		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println("Data Inserted  Sucessfully");

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

package com.xworkz.deletequery;

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
			 String updateQuery = "Delete FROM site_engineers Where  id =8";;


			try {
				connection = DriverManager.getConnection(url, userName, password);
				System.out.println("connection is suceesfull" + url);

				Statement statement = connection.createStatement();
				statement.executeUpdate(updateQuery);
				System.out.println("Data Deleted  Sucessfully");

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

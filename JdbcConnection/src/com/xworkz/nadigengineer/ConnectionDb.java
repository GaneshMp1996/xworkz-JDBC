package com.xworkz.nadigengineer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDb {
	//import com.mysql.cj.jdbc.Driver;

	public static void main(String[] args) throws SQLException {

		String url="jdbc:mysql://localhost:3306/nadig_engineers";
		//here mysql can be replaced by any other database
		String userName="root";
		String password="ganeshmp";
		Connection connection=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");// Class.forName() will create
			//and object of driver class here Driver is a class
			//its a translator between java and sql


			// or we can use

			//Driver driver = new Driver();
			//DriverManager.registerDriver(driver);

			connection=DriverManager.getConnection(url,userName,password);
			System.out.println("connection established "+url);

		}catch(SQLException | ClassNotFoundException exception) {
			System.out.println("connection failed "+exception.getMessage());
		}
		finally {
			connection.close();
		}
	}
}



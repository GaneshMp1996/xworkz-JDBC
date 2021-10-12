package com.xworkz.laptop.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LaptopDaoImpl implements LaptopDao {

	@Override
	public void savelaptopRecord() {
		System.out.println("invoked savelaptopRecord");
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection = null;
		String insertQuery = "INSERT into  Laptop  VALUE('5','HP2','Silver','60000')";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println("Laptop Record is Saved Sucessfully");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}

		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public void updateBrand() {
		System.out.println("Invoked Update Brand Record");
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection = null;
		String updateQuery = "UPDATE Laptop set COLOR = 'Block' where ID = 1;";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);
			System.out.println("Laptop Update is Saved Sucessfully");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}

		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("-------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public void deleteLaptopbyId() {
		System.out.println("invoked deleteLaptopById Record");
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection = null;
		String deleteQuery = "delete from laptop where id = 2";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);
			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery);
			System.out.println("Laptop Query is deleted  Sucessfully");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}

		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("-------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public void readSingleRecordById() {
		System.out.println("invoked readSingleRecordById");
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection = null;	
		String readSingleRecordById = "SELECT * FROM Laptop WHERE  id=1;";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readSingleRecordById);
			resultSet.next(); 
			System.out.println("id "+ resultSet.getInt(1));
			System.out.println("Brand "+ resultSet.getString(2));
			System.out.println("Color "+ resultSet.getString(3));
			System.out.println("Price "+ resultSet.getString(4));
			System.out.println("Single Line Record by ID Readed Sucessfully");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("-------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

	public void readAllRecordById() {
		System.out.println("invoked readAllRecordById");
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection = null;
		String readAllRecord = "SELECT * FROM Laptop";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readAllRecord);
			//boolean isRowPresent = resultSet.next();
			//while(isRowPresent)
			while(resultSet.next()) {
				System.out.println("id "+ resultSet.getInt(1));
				System.out.println("Brand "+ resultSet.getString(2));
				System.out.println("Color "+ resultSet.getString(3));
				System.out.println("Price "+ resultSet.getString(4));
			}
		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("All Record Readed Sucessfully");
					System.out.println("connection closed");
					System.out.println("-------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}


		}
	}

	public void readlaptopPriceById() {
		System.out.println("invoked readlaptopPriceById");
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection = null;
		String readlaptopPriceById="select price FROM Laptop WHERE id=4";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery( readlaptopPriceById);
			resultSet.next();
			System.out.println("Price "+ resultSet.getInt(1));
			System.out.println("Laptop Price by ID is Readed  Sucessfully");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("-------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void readLaptopBrandById() {
		System.out.println("invoked readLaptopBrandById");
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection = null;
		String readLaptopBrandById="select Brand FROM Laptop WHERE id=3";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery( readLaptopBrandById);
			resultSet.next();
			System.out.println("Brand "+ resultSet.getString(1));
			System.out.println("Laptop Brand by ID is Readed  Sucessfully");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("-------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public void readLaptopColorById() {
		System.out.println("readLaptopColorById");
		String url = "jdbc:mysql://localhost:3306/Laptop";
		String userName = "root";
		String password = "ganeshmp";
		Connection connection = null;
		String readLaptopColorById="select Color FROM Laptop WHERE id=3";
		try {
			connection = DriverManager.getConnection(url, userName, password);
			System.out.println("connection is suceesfull" + url);

			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(readLaptopColorById);
			resultSet.next();
			System.out.println("Color "+ resultSet.getString(1));
			System.out.println("Laptop Color FROM Id is Readed  Sucessfully");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
		finally {
			try {
				if(connection != null) {
					connection.close();
					System.out.println("connection closed");
					System.out.println("-------------------");
				}
				else {
					System.out.println("connection is not closed");
				}
			}catch (SQLException e) {
				e.printStackTrace();
			}


		}

	}
}











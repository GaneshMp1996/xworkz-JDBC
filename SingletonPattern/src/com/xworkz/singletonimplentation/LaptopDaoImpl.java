package com.xworkz.singletonimplentation;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.xworkz.singletonimplentation.util.ConnectionProvider;

public class LaptopDaoImpl implements LaptopDao {
	public void savelaptopRecord() {
		System.out.println("invoked savelaptopRecord");
		String insertQuery = "INSERT into  Laptop  VALUE('10','HP2','Silver','60000')";

		try {
			Connection connection= ConnectionProvider.getConnection();
			Statement statement = connection.createStatement();
			statement.executeUpdate(insertQuery);
			System.out.println("Laptop Record is Saved Sucessfully");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
	}

	public void updateBrand() {
		System.out.println("Invoked UpdateBrandRecord");
		String updateQuery = "UPDATE Laptop set Brand = 'Block' where ID = 6;";

		try {
			Connection connection= ConnectionProvider.getConnection();
			Statement statement = connection.createStatement();
			statement.executeUpdate(updateQuery);
			System.out.println("Laptop Brand is Saved Sucessfully");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
	}

	public void deleteLaptopbyId() {
		System.out.println("invoked deleteLaptopById Record");
		String deleteQuery = "delete from laptop where id = ?";

		try {
			Connection connection= ConnectionProvider.getConnection();
			Statement statement = connection.createStatement();
			statement.executeUpdate(deleteQuery);
			System.out.println("Laptop Query is deleted  Sucessfully");

		}catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
	}

	public void readSingleRecordById() {
		System.out.println("invoked readSingleRecordById");
		String readSingleRecordById = "SELECT * FROM Laptop WHERE  id=1;";

		try {
			Connection connection= ConnectionProvider.getConnection();
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

	}

	public void readAllRecordById() {
		System.out.println("invoked readAllRecordById");
		String readAllRecord = "SELECT * FROM Laptop";

		try {
			Connection connection= ConnectionProvider.getConnection();
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

	}

	public void readlaptopPriceById() {
		System.out.println("invoked readlaptopPriceById");
		String readlaptopPriceById="select price FROM Laptop WHERE id=?";

		try {
			Connection connection= ConnectionProvider.getConnection();
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

	}

	public void readLaptopBrandById() {
		System.out.println("invoked readLaptopBrandById");
		String readLaptopBrandById="select Brand FROM Laptop WHERE id=3";

		try {
			Connection connection= ConnectionProvider.getConnection();
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
	}

	public void readLaptopColorById() {
		System.out.println("readLaptopColorById");
		String readLaptopColorById="select Color FROM Laptop WHERE id=3";

		try {
			Connection connection= ConnectionProvider.getConnection();
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

	}
}


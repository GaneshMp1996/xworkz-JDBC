package com.xworkz.singletonimplementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.xworkz.singletonimplementation.util.ConnectionProvider;

public class LaptopDaoImpl implements LaptopDao {

	

	public void savelaptopRecord(int id, String brand, String color, double price, int ram, String processor, boolean Is_Camera_Present, String Screen_Size, int Weight, boolean Is_Cd_Supported) {
		System.out.println("invoked savelaptopRecord");
		String insertQuery = "INSERT into  Laptop  VALUE(?,?,?,?,?,?,?,?,?,?)";

		try {
			Connection connection = ConnectionProvider.getConnection();
			// pass the query
			PreparedStatement preparedstatement = connection.prepareStatement(insertQuery);
			// set the values using setters
			preparedstatement.setInt(1, id);
			preparedstatement.setString(2, brand);
			preparedstatement.setString(3, color);
			preparedstatement.setDouble(4, price);
			preparedstatement.setInt(5, ram);
			preparedstatement.setString(6, processor);
			preparedstatement.setBoolean(7, Is_Camera_Present);
			preparedstatement.setString(8, Screen_Size);
			preparedstatement.setInt(9, Weight);
			preparedstatement.setBoolean(10, Is_Cd_Supported);

			preparedstatement.executeUpdate();
			System.out.println("Laptop Record is Saved Sucessfully");

		} catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}

	}

	public void updateBrand(String updateBrand) {
		System.out.println("Invoked UpdateBrandRecord");
		String updateQuery = "UPDATE Laptop set Brand = ? where id = 5";

		try {
			Connection connection = ConnectionProvider.getConnection();
			// pass the query
			PreparedStatement preparedstatement = connection.prepareStatement(updateQuery);
			// set the values using setters
			preparedstatement.setString(1, updateBrand);
			preparedstatement.executeUpdate();
			System.out.println("Laptop Update is Saved Sucessfully");

		} catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}

	}

	public void deleteLaptopbyId(int id) {
		System.out.println("invoked deleteLaptopById Record");
		String deleteQuery = "delete from laptop WHERE id=?";

		try {
			Connection connection = ConnectionProvider.getConnection();
			// pass the query
			PreparedStatement preparedstatement = connection.prepareStatement(deleteQuery);
			// set the values using setters
			preparedstatement.setInt(1, 1);
			preparedstatement.executeUpdate();
			System.out.println("Laptop from id deleted Sucessfully");

		} catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}

	}

	public void readSingleRecordById(int id) {
		System.out.println("invoked readSingleRecordById");
		String readSingleRecordById = "SELECT * FROM Laptop WHERE  id=?";

		try {
			Connection connection = ConnectionProvider.getConnection();
			// pass the query
			PreparedStatement preparedstatement = connection.prepareStatement(readSingleRecordById);
			// set the values using setters
			preparedstatement.setInt(1, id);
			preparedstatement.executeQuery();
			System.out.println("Single Line Record of laptop by ID Readed Sucessfully");

		} catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}

	}

	public void readAllRecord() {
		System.out.println("invoked readAllRecordById");
		String readAllRecord = "SELECT * From laptop.laptop ";

		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(readAllRecord);
			// *boolean isRowPresent = resultSet.next();
			// *while(isRowPresent)
			ResultSet resultset = preparedstatement.executeQuery(readAllRecord);

			while (resultset.next()) {
				System.out.println("id " + preparedstatement.getResultSet().getInt(1));
				System.out.println("Brand " + preparedstatement.getResultSet().getString(2));
				System.out.println("Color " + preparedstatement.getResultSet().getString(3));
				System.out.println("Price " + preparedstatement.getResultSet().getDouble(4));
				System.out.println("Ram " + preparedstatement.getResultSet().getInt(5));
				System.out.println("Processor " + preparedstatement.getResultSet().getString(6));
				System.out.println("Is_Camera_Present " + preparedstatement.getResultSet().getBoolean(7));
				System.out.println("Screen_Size " + preparedstatement.getResultSet().getString(8));
				System.out.println("Weight " + preparedstatement.getResultSet().getInt(9));
				System.out.println("Is_Cd_Supported " + preparedstatement.getResultSet().getBoolean(10));
				System.out.println("All Query Records of laptop by ID Readed Sucessfully");
			}
		} catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}

	}

	public void readlaptopPriceById(int id) {
		System.out.println("invoked readlaptopPriceById");
		String readlaptopPriceById = "select price FROM Laptop WHERE id=?";

		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(readlaptopPriceById);
			preparedstatement.setInt(1, id);
			preparedstatement.executeQuery();
			// *System.out.println("Price "+ preparedstatement.getResultSet().getDouble(4));
			System.out.println("Laptop Price by ID is Readed  Sucessfully");

		} catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
	}

	public void readLaptopBrandById(int id) {
		System.out.println("invoked readLaptopBrandById");
		String readLaptopBrandById = "select Brand FROM Laptop WHERE id=?";

		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(readLaptopBrandById);
			preparedstatement.setInt(1, id);
			preparedstatement.executeQuery();

			// *System.out.println("Brand "+ preparedstatement.getResultSet().getDouble(3));
			System.out.println("Laptop Brand by ID is Readed  Sucessfully");

		} catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}
	}

	public void readLaptopColorById(int id) {
		System.out.println("readLaptopColorById");
		String readLaptopColorById = "select Color FROM Laptop WHERE id=?";

		try {
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedstatement = connection.prepareStatement(readLaptopColorById);
			preparedstatement.setInt(1, id);
			preparedstatement.executeQuery();
			System.out.println("Laptop Color FROM Id is Readed  Sucessfully");

		} catch (SQLException sqlException) {
			System.out.println("Inside catch black Exception");
			System.out.println(sqlException.getMessage());
			sqlException.printStackTrace();
		}

	}

	

}

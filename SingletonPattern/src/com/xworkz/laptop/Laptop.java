package com.xworkz.laptop;
import java.sql.Connection;
import com.xworkz.singletonimplentation.LaptopDao;
import com.xworkz.singletonimplentation.LaptopDaoImpl;
import com.xworkz.singletonimplentation.util.ConnectionProvider;

public class Laptop {
	public static void main(String args[]) {
		LaptopDao laptopDao=new LaptopDaoImpl();
		Connection connection=ConnectionProvider.getConnection();
		laptopDao.savelaptopRecord();
		System.out.println("-------------------");
		laptopDao.updateBrand();
		System.out.println("--------------------");
		laptopDao.deleteLaptopbyId();
		System.out.println("--------------------");
		laptopDao.readSingleRecordById();
		System.out.println("--------------------");
		laptopDao.readAllRecordById();
		System.out.println("--------------------");
		laptopDao.readlaptopPriceById();
		System.out.println("--------------------");
		laptopDao.readLaptopBrandById();
		System.out.println("--------------------");
		laptopDao.readLaptopColorById();
		System.out.println("--------------------");


	}		

}

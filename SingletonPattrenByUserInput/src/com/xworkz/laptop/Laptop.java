package com.xworkz.laptop;

import com.xworkz.singletonimplementation.LaptopDao;
import com.xworkz.singletonimplementation.LaptopDaoImpl;

public class Laptop {
	public static void main(String args[] ) {
		LaptopDao laptopDao=new LaptopDaoImpl();
		laptopDao.savelaptopRecord(8,"Acer","White",50000);
		System.out.println("-------------------");

		laptopDao.updateBrand("Apple");
		System.out.println("--------------------");

		laptopDao.deleteLaptopbyId(7);
		System.out.println("--------------------");

		laptopDao.readSingleRecordById(3);
		System.out.println("--------------------");

		laptopDao.readAllRecord();
		System.out.println("--------------------");

		laptopDao.readlaptopPriceById(5);
		System.out.println("--------------------");

		laptopDao.readLaptopBrandById(4);
		System.out.println("--------------------");

		laptopDao.readLaptopColorById(3);
		System.out.println("--------------------");
	


	}		


}

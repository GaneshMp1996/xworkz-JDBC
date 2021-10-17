package com.xworkz.laptop;

import com.xworkz.singletonimplementation.LaptopDao;
import com.xworkz.singletonimplementation.LaptopDaoImpl;

public class Laptop {
	public static void main(String args[] ) {
		LaptopDao laptopDao=new LaptopDaoImpl();
		laptopDao.savelaptopRecord(1,"Acer","White",50000,6,"i5",true,"22",3,true);
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

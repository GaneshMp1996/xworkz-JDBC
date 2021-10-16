package com.xworkz.laptop;

import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.singletonpatternimplementation.LaptopDao;
import com.xworkz.singletonpatternimplementation.LaptopDaoImpl;

public class Laptop {
	public static void main(String args[]) {
		LaptopDaoImpl laptopDaoImpl = new LaptopDaoImpl();
		LaptopEntity laptopEntity = new LaptopEntity(1, "Hp1", "Silver", 30000, 8, "i7", true, 22, 2, true);
		laptopDaoImpl.savelaptopRecord(laptopEntity);
		System.out.println("---------------------");

		LaptopEntity laptopEntity1 = new LaptopEntity("UpdateBrand");
		laptopEntity1.setBrand("Apple");
		laptopEntity1.setId(1);
		laptopDaoImpl.updateBrand(laptopEntity1);
		System.out.println("--------------------");

		LaptopEntity laptopEntity2 = new LaptopEntity("DeleteQuery");
		laptopEntity2.setId(6);
		laptopDaoImpl.deleteLaptopbyId(laptopEntity2);
		System.out.println("-----------------------");

		LaptopEntity laptopEntity3 = new LaptopEntity("readSingleRecordById");
		laptopEntity3.setId(2);
		laptopDaoImpl.readSingleRecordById(laptopEntity3);
		System.out.println("-----------------------------");

		LaptopEntity laptopEntity4 = new LaptopEntity("readAllRecord");
		laptopDaoImpl.readAllRecord(null);
		System.out.println("-----------------------------");

		LaptopEntity laptopEntity5 = new LaptopEntity("readlaptopPriceById");
		laptopEntity5.setId(1);
		laptopDaoImpl.readlaptopPriceById(laptopEntity5);
		System.out.println("-------------------------------");

		LaptopEntity laptopEntity6 = new LaptopEntity("readlaptopBrandById");
		laptopEntity6.setId(8);
		laptopDaoImpl.readLaptopBrandById(laptopEntity6);
		System.out.println("-------------------------------");

		LaptopEntity laptopEntity7 = new LaptopEntity("readlaptopColorById");
		laptopEntity7.setId(2);
		laptopDaoImpl.readLaptopColorById(laptopEntity7);
		System.out.println("-------------------------------");

	}

}

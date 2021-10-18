package com.xworkz.laptop;

import java.util.List;

import com.xworkz.laptop.entity.LaptopEntity;
import com.xworkz.singletonpatterenimplementation.LaptopDaoImpl;

public class Laptop {
	public static void main(String args[]) {
		LaptopDaoImpl laptopDaoImpl = new LaptopDaoImpl();

		List<LaptopEntity> allrecords = laptopDaoImpl.readAllRecord();
		for (LaptopEntity laptopEntity : allrecords) {
			System.out.println(laptopEntity + "/t");
			System.out.println();
			System.out.println("-----------------------------");
		}
		//		LaptopEntity laptopEntity = new LaptopEntity(1, "Hp1", "Silver", 30000, 8, "i7", true, 22, 2, true);
		//		laptopDaoImpl.savelaptopRecord(laptopEntity);
		//		System.out.println("---------------------");

		//		LaptopEntity laptopEntity1 = new LaptopEntity("UpdateBrand");
		//		laptopEntity1.setBrand("Apple");
		//		laptopEntity1.setId(1);
		//		laptopDaoImpl.updateBrand(laptopEntity1);
		//		System.out.println("--------------------");

		//		LaptopEntity laptopEntity2 = new LaptopEntity("DeleteQuery");
		//		laptopEntity2.setId(6);
		//		laptopDaoImpl.deleteLaptopbyId(laptopEntity2);
		//		System.out.println("-----------------------");

		//		LaptopEntity laptopEntity3 = new LaptopEntity();
		//		laptopEntity3.setId(2);
		//		laptopDaoImpl.readSingleRecordById(laptopEntity3);
		//		System.out.println("-----------------------------");

		//		LaptopEntity laptopEntity5 = new LaptopEntity("readlaptopPriceById");
		//		laptopEntity5.setId(1);
		//		laptopDaoImpl.readlaptopPriceById(laptopEntity5);
		//		System.out.println("-------------------------------");
		//
		//		LaptopEntity laptopEntity6 = new LaptopEntity("readlaptopBrandById");
		//		laptopEntity6.setId(8);
		//		laptopDaoImpl.readLaptopBrandById(laptopEntity6);
		//		System.out.println("-------------------------------");
		//
		//		LaptopEntity laptopEntity7 = new LaptopEntity("readlaptopColorById");
		//		laptopEntity7.setId(2);
		//		laptopDaoImpl.readLaptopColorById(laptopEntity7);
		//		System.out.println("-------------------------------");

	}
}

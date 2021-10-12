package com.xworkz.laptop.dao;

public interface LaptopDao {
	void savelaptopRecord();

	void updateBrand();

	void deleteLaptopbyId();

	void readSingleRecordById();

	void readAllRecordById();

	void readlaptopPriceById();

	void readLaptopBrandById();

	void readLaptopColorById();


}

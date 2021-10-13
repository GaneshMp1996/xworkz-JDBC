package com.xworkz.singletonimplementation;

public interface LaptopDao {
	void savelaptopRecord(int id,String Brand, String Color,double Price);

	void updateBrand(String updateBrand);

	void deleteLaptopbyId(int id);

	void readSingleRecordById(int id);

	void readAllRecordById(int id);

	void readlaptopPriceById(int id);

	void readLaptopBrandById(int id);

	void readLaptopColorById(int id);

}

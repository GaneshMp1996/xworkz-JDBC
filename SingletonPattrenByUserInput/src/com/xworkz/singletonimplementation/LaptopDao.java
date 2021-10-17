package com.xworkz.singletonimplementation;

public interface LaptopDao {
	void savelaptopRecord(int id, String brand, String color, double price, int ram, String processor,
			boolean Is_Camera_Present,String Screen_Size, int Weight, boolean Is_Cd_Supported);

	void updateBrand(String updateBrand);

	void deleteLaptopbyId(int id);

	void readSingleRecordById(int id);

	void readAllRecord();

	void readlaptopPriceById(int id);

	void readLaptopBrandById(int id);

	void readLaptopColorById(int id);

	

}

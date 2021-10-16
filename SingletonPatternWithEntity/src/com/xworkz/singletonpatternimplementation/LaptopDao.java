package com.xworkz.singletonpatternimplementation;

import com.xworkz.laptop.entity.LaptopEntity;

public interface LaptopDao {

	void savelaptopRecord(LaptopEntity laptopEntity);

	void updateBrand(LaptopEntity laptopEntity);

	void deleteLaptopbyId(LaptopEntity laptopEntity);

	void readSingleRecordById(LaptopEntity laptopEntity);

	void readAllRecordById(LaptopEntity laptopEntity);

	void readlaptopPriceById(LaptopEntity laptopEntity);

	void readLaptopBrandById(LaptopEntity laptopEntity);

	void readLaptopColorById(LaptopEntity laptopEntity);

}

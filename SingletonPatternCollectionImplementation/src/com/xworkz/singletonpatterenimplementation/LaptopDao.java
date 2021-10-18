package com.xworkz.singletonpatterenimplementation;

import java.util.List;

import com.xworkz.laptop.entity.LaptopEntity;

public interface LaptopDao {
	void savelaptopRecord(LaptopEntity laptopEntity);

	void updateBrand(LaptopEntity laptopEntity);

	void deleteLaptopbyId(LaptopEntity laptopEntity);

	LaptopEntity readSingleRecordById(LaptopEntity laptopEntity);

	List<LaptopEntity> readAllRecord();

	void readlaptopPriceById(LaptopEntity laptopEntity);

	void readLaptopBrandById(LaptopEntity laptopEntity);

	void readLaptopColorById(LaptopEntity laptopEntity);

}

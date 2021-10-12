package com.xworkz.singletonimplentation;
import java.sql.SQLException;

import com.xworkz.singletonimplentation.util.ConnectionProvider;

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

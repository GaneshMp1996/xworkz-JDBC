package com.xworkz.laptop;
import com.xworkz.laptop.dao.LaptopDao;
import com.xworkz.laptop.dao.LaptopDaoImpl;
class Laptop {

	public static void main(String args[]) {
		
		
		LaptopDao laptopDao=new LaptopDaoImpl();
		laptopDao.savelaptopRecord();
		laptopDao.updateBrand();
		laptopDao.deleteLaptopbyId();
		laptopDao.readSingleRecordById();
		laptopDao.readAllRecordById();
		laptopDao.readlaptopPriceById();
		laptopDao.readLaptopBrandById();
		laptopDao.readLaptopColorById();
		
		
			
		
		

	}		
}




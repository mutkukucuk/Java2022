package business;

import java.util.Iterator;
import java.util.List;

import dataAccess.HibernateProductDao;
import dataAccess.ProductDao;
import entities.Product;
import oopWithNLayeredApp.core.loging.Logger;


public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}


	public void add(Product product){ //response request
		//iş kuralları
		if(product.getUnitPrice()<10) {
			System.out.println("Urun fiyati 10'dan kucuk olamaz");
		}
		
		productDao.add(product);
		for (Logger logger : loggers) { //db, file]
			logger.log(product.getName());
		}
		
		
		
		
	}
}

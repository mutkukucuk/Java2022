package oopWithNLayeredApp;


import business.ProductManager;
import dataAccess.JdbcProductDao;
import entities.Product;
import oopWithNLayeredApp.core.loging.DatabaseLogger;
import oopWithNLayeredApp.core.loging.FileLogger;
import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.core.loging.MailLogger;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(1,"Iphone Xr", 9000);
		
		Logger[] loggers = {new DatabaseLogger(), new MailLogger(), new FileLogger()};
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(),loggers);
		productManager.add(product1);
		
	}
}

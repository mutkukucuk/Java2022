package oop1;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		// set value
		Product product1 = new Product();
		product1.setName("Delogni Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7000);
		product1.setUnitPrice(3);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Zocca Kahve Makinesi");
		product2.setDiscount(10);
		product2.setUnitPrice(10000);
		product2.setUnitPrice(7);
		product2.setImageUrl("image2.jpg");
		
		Product product3 = new Product();
		product3.setName("Gora Kahve Makinesi");
		product3.setDiscount(8);
		product3.setUnitPrice(4000);
		product3.setUnitPrice(5);
		product3.setImageUrl("image3.jpg");

		
		Product[] products = {product1, product2, product3};
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05522222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Muhammet Utku");
		individualCustomer.setLastName("Kucuk");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("111111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		Customer[] customers = {individualCustomer, corporateCustomer};
	}

}

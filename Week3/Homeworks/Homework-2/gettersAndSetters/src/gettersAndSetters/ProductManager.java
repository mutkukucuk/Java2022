package gettersAndSetters;

public class ProductManager {
	private Product product;

	public ProductManager(Product product) {
		this.product = product;
	}
	
	public void add() {
		System.out.println("Ürün eklendi");
	}
	
	public void getCode(Product product) {
		System.out.println("Kod getiridi P"+product.getId());
	}
}

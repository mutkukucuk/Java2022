package gettersAndSetters;

public class Product {
	public Product(int id, String name, String description, double price, int stockAmount, String color) {
		System.out.println("Yapici blok calisti");
		this.id = id;
		this.color = color;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.name = name;
	}
	
	public Product() {
		
	}
	
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String color;
	private String code;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getKod() {
		return code;
	}
	public void setKod(String kod) {
		this.code = kod;
	}

}

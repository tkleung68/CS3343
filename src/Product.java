
public class Product {
	private int pid;
	private String name;
	private double price;
	private CompanyDiscount cDiscount;
	private ProductDiscount pDiscount;
	private int stock;
	
	public Product(int id, String n, double p, int s) {
		pid = id;
		name = n;
		price = p;
		stock = s;
	}
	
	public Product(int id, String n, double p) {
		pid = id;
		name = n;
		price = p;
		stock = 0;
	}
	
	public void addStock(int amount) {
		stock += amount;
	}
	
	public void addCompanyDiscount(CompanyDiscount cDiscount) {
		this.cDiscount = cDiscount;
	}
	
}


public class Product {
	private int pid;
	private String name;
	private double price;
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
	

	public String toString() {
		return String.format("%d: %s, $%f, %d in stock", pid, name, price, stock);
	}
	
	public int getPid() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
	
}

import java.util.ArrayList ;

public class ProductController {
	//start from 10000
	private int pidCounter = 10000;
	private static ProductController instance = new ProductController();
	

	public static ProductController getInstance() {
		return instance;
	}
	
	public Product createProductForCompany(Company c, String name, double price, int stock) {
		Product p = new Product(pidCounter++,name,price,stock);
		((Company) c).addProduct(p);
		return p;
		
	}
	
	public void createProductForCompany(Company c, Product p) {
		c.addProduct(p);
		pidCounter++;
	}
	
	public void substractPid(int n) {
		pidCounter = pidCounter - n;
	}
}

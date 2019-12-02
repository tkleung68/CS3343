
public class TrolleyItem {
	private Product product;
	private int quantity;
	private Company company;

	public TrolleyItem(Product p, int q, Company c) {
		product = p;
		quantity = q;
		company = c;
	}
	
	public String toString() {
		return product.getName() + "(" + product.getPid() + ")*" + quantity; 
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public double getTotal() {
		return product.getPrice()*quantity;
	}
	
	public void changeQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public void addQuantity(int quantity) {
		this.quantity += quantity; 
	}

	public void subQuantity(int quantity) {
		this.quantity -= quantity; 
	}
	
	public void completeTransaction(Customer c) {
		company.recordTransaction(c, product, quantity);
	}
}

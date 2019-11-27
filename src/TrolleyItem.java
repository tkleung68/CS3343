
public class TrolleyItem {
	private Product product;
	private int quantity;

	public TrolleyItem(Product p, int q) {
		product = p;
		quantity = q;
	}
	
	public Product getProduct() {
		return this.product;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void changeQuantity(int quantity) {
		this.quantity = quantity;
	}
}

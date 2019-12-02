import java.util.ArrayList;

public class Company extends Account{
	private ArrayList<Product> productList;
	private ArrayList<SaleRecord> saleRecordList;
	
	public Company(String userID, String password, String name) {
		super(userID, password, name);
		productList = new ArrayList<Product>();
		saleRecordList = new ArrayList<SaleRecord>();
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	public void removeProduct(Product product) {
		productList.remove(product);
	}
	
	public Product searchProductByPid(int pid) throws NoSuchProductException {
		for (Product product:productList) {
			if(product.getPid() == pid)
				return product;
		}
		throw new NoSuchProductException();
	}
	
	@Override
	public String toString() {
		return super.getName() + " - " + productList.size() + " item(s) in total.";
	}
	
	public void recordTransaction(Customer customer, TrolleyItem item) {
		saleRecordList.add(new SaleRecord(customer, item));
		
	}
}

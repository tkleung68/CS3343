import java.util.ArrayList;

public class Company extends Account{
	private ArrayList<Product> productList;
	private ArrayList<SaleRecord> saleRecordList;
	private String description;
	
	public Company(String uID, String pw, String n) {
		super(uID, pw, n);
		productList = new ArrayList<Product>();
		saleRecordList = new ArrayList<SaleRecord>();
		description = "";
	}

	public ArrayList<Product> getProductList() {
		return productList;
	}
	
	public void addProduct(Product p) {
		productList.add(p);
	}
	
	public void removeProduct(Product p) {
		productList.remove(p);
	}
	
	public Product searchProductByPid(int pid) throws NoSuchProductException {
		for (Product p:productList) {
			if(p.getPid() == pid)
				return p;
		}
		throw new NoSuchProductException();
	}
	
	@Override
	public String toString() {
		return super.getName() + " : " + description + "\n";
	}
	
	public void recordTransaction(Customer c, Product p, int q) {
		saleRecordList.add(new SaleRecord(c,p,q));
		
	}
}

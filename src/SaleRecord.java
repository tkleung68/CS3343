import java.text.SimpleDateFormat;
import java.util.Date;

public class SaleRecord {
	private Customer customer;
	private Product product;
	private int quantity;
	private Date date;
	
	public SaleRecord(Customer c, Product p, int q) {
		customer = c;
		product = p;
		quantity = q;
		date = new Date();
	}
	
	public String toString() {
	    SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");  
	    String strDate = formatter.format(date);
		return strDate + " " + customer.getName() + ": " + product.getName() + "(" + product.getPid() + ")*" + quantity; 
	}
}

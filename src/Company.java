import java.util.ArrayList;

public class Company extends Account{
	private String name;
	private ArrayList productList;
	private ArrayList saleRecordList;
	private String desciption;
	
	public Company(String uID, String pw, String name, String des) {
		super(uID, pw);
		this.name = name;
		productList = new ArrayList<Product>();
		saleRecordList = new ArrayList<SaleRecord>();
		desciption = des;
	}
	
	@Override
	public void runOperation() {
		
	}
}

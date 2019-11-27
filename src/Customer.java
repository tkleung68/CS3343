import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends Account{
	private String name;
	private double balance;
	private ArrayList<TrolleyItem> shoppingTrolley;
	
	public Customer(String uID, String pw, String n) {
		super(uID, pw);
		name = n;
		balance = 0;
		shoppingTrolley = new ArrayList<TrolleyItem>();
	}
	
	public void AddItemToTrolley(Product product, int quantity) {
		shoppingTrolley.add(new TrolleyItem(product, quantity));
	}
	
	public void RemoveIteamFromTrolley(Product product, int quantity) {
		for (TrolleyItem item : shoppingTrolley) {
			if(item.getProduct().equals(product)) {
				if(item.getQuantity() == quantity) {
					shoppingTrolley.remove(item);
				}else if(item.getQuantity() > quantity)
				{
					int newAmount = item.getQuantity() - quantity;
					item.changeQuantity(newAmount);
				}else
					System.out.print("Error quantity");
			}
		}
	}
	
	
	
	
	
	public void runOperation() {
		
	}
}

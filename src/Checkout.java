
public class Checkout implements Command{

	@Override
	public void execute(String[] cmdParts) {
		AccountController ac = AccountController.getInstance();
		if(ac.currentAccountIsCustomer()) {
			Account user = ac.getCurrentAccount();
			double totalAmount = ((Customer)user).checkout();
			
			System.out.println("You have spent $" + totalAmount + " on this transaction.");

		}
		
		
		
	}

}

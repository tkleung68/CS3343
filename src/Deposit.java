
public class Deposit implements Command{
	Account user;
	int amount;
	
	@Override
	public void execute(String[] cmdParts) {
		AccountController ac = AccountController.getInstance();
		if(ac.currentAccountIsCustomer()) {
			user = ac.getCurrentAccount();
			amount = Integer.parseInt(cmdParts[1]);
			((Customer) user).deposit(amount);
			System.out.println("Successfully added value to your account!");
		}else {
			System.out.println("Please login your customer account.");
		}

		
	}

}

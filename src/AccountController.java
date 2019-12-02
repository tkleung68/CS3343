import java.util.HashMap;

public class AccountController {
	private HashMap<String, Account> accountMap = new HashMap<String, Account>();
	private static AccountController instance = new AccountController();
	
	public void listAllCompany() {
		accountMap.forEach((id,account)->{
			if(account instanceof Company) {
				System.out.println(account.toString());
			}
		});
	}
	
	public void listAllCustomer() {
		accountMap.forEach((id,account)->{
			if(account instanceof Customer) {
				System.out.println(account.toString());
			}
		});
	}
	
	public void addAccount(Account a) {
		accountMap.put(a.getUserID(), a);
	}
	
	public boolean checkExist(String id) {
		if(accountMap.containsKey(id)) {
			return true;
		}
		return false;
	}
	public static AccountController getInstance() {
		return instance;
	}
	
	public Account searchAccountById(String id) throws NoSuchCompanyException {
		if(accountMap.containsKey(id)) {
			return accountMap.get(id);
		}
		else {
			throw new NoSuchCompanyException();
		}
	}

	public HashMap<String, Account> getAccountMap() {
		return accountMap;
	}

	public void setAccountMap(HashMap<String, Account> accountMap) {
		this.accountMap = accountMap;
	}


}

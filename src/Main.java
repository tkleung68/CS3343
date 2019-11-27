import java.util.*;

public class Main {
	private static ArrayList<Account> accounts = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		boolean running = true;
        while(running) {
        	System.out.println("Please input your cmd.");
        	System.out.println("'reg' - register, 'log' - login");
        	String cmd = scanner.nextLine();
        	switch(cmd) {
        		case "reg":
        			registerAccount();
        			break;
        		case "log":
        			loginAccount();
        			break;
        		default:
        			System.out.println("Invalid input.");
        	}
        }
    }
	
	private static Account findAccount(String id,String password) {
		for(Account account: accounts) {
			if(account.login(id, password)) {
				return account;
			}
		}
		return null;
	}

	private static void loginAccount() {
		boolean running = true;
		while(running) {
			System.out.println("What is your userID and password? Example 'user123 password345' seperate with space. 'can' to cancel.");
			String parts[] = scanner.nextLine().split(" ");
			if(parts.length==1 && parts[0].equals("can")) {
				running = false;
			}
			else if(parts.length !=2) {
				System.out.println("Invalid input");
			}
			else  {
				Account currentAccount = findAccount(parts[0],parts[1]);
				if(currentAccount !=null) {
					running = false;
					currentAccount.runOperation();
				}else {
					System.out.println("Invalid id or password.");
				}
			}
		}
	}

	private static void registerAccount() {
		boolean running = true;
		while(running) {
			System.out.println("Which type of account you would like to register?");
			System.out.println("'com' - company, 'cus' - customer, 'can' - cancel");
			String cmd = scanner.nextLine();
			switch(cmd) {
				case "com":
					System.out.println("Input name, id, password and description split by '#' (Exmaple:'City Sushi Limited#csushi#12345678#A company that sells sushi')");
					String[] parts = scanner.nextLine().split("#");
					if(parts.length!=4) {
						System.out.println("Invalid input.");
					}
					else {
						running = false;
						String companyName = parts[0];
						String companyID =  parts[1];
						String companyPassword = parts[2];
						String companyDescription = parts[3];
						Account account = new Company(companyID, companyPassword,companyName,companyDescription);
						accounts.add(account);
					}
					break;
				case "can":
					System.out.println("Input name, id, password split by '#' (Exmaple:'Sam Leung#tkleung68#12345678')");
					String[] parts1 = scanner.nextLine().split("#");
					if(parts1.length!=3) {
						System.out.println("Invalid input.");
					}
					else {
						running = false;
						String customerName = parts1[0];
						String customerID =  parts1[1];
						String customerPassword = parts1[2];
						Account account = new Customer(customerID, customerPassword,customerName);
						accounts.add(account);
					}
					break;
				default:
					System.out.println("Invalid input.");
			}
		}

		
	}
}

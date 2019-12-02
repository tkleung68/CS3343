public class RegisterCompany implements Command{
	
	@Override
	public void execute(String[] cmdParts) {
		try {
			if(cmdParts.length < 4) {
				throw new InsufficientParameterException();
			}
			String id = cmdParts[1];
			String password = cmdParts[2];
			String name = cmdParts[3];
			Company newCompany = new Company(id, password, name);
			ShopSystem shopSystem = ShopSystem.getInstance();
			if(shopSystem.registerCompany(newCompany)) {
				System.out.println("Successfully create an account, account name: " + newCompany.getName());
			}
			else {
				System.out.println("The id is existed. Please choose another id.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
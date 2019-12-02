
public class CreateProduct implements Command{
	Account company;
	Product product;
	int quantity;

	@Override
	public void execute(String[] cmdParts) {
		AccountController ac = AccountController.getInstance();
		ShopSystem shopSystem = ShopSystem.getInstance();
		if(shopSystem.currentAccountIsCompany()) {
			company = ac.searchAccountById(cmdParts[1]);
			String pname = cmdParts[2];
			double pprice = Double.parseDouble(cmdParts[3]);
			int stock = Integer.parseInt(cmdParts[4]);
			ProductController pControllor = ProductController.getInstance();
			
			product = pControllor.createProductForCompany((Company)company,pname,pprice,stock);
			System.out.println("Successfully create the product.");
			
		}
		else {
			System.out.println("Please login your company account.");
		}
		

	}

}

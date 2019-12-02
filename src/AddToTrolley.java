
public class AddToTrolley implements Command{
	Company company;
	Product product;
	int quantity;
	Account user;

	@Override
	public void execute(String[] cmdParts) {
		ShopSystem shopSystem = ShopSystem.getInstance();
		quantity = Integer.parseInt(cmdParts[3]);
		try {
			company = shopSystem.searchCompanyById(cmdParts[1]);
			product = shopSystem.searchProductInCompany(company, Integer.parseInt(cmdParts[2]));
			if(shopSystem.addItemToCustomerTrolley(product, quantity, company)) {
				System.out.println("Item successfully added to your trolley.");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}

<<<<<<< HEAD

public class ShowAllShop implements Command {

	@Override
	public void execute(String[] cmdParts) {
		try {
		ShopSystem shopSystem = ShopSystem.getInstance();
		shopSystem.showAllShop();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
=======

public class ShowAllShop implements Command {

	@Override
	public void execute(String[] cmdParts) {
		try {
		ShopSystem shopSystem = ShopSystem.getInstance();
		shopSystem.showAllShop();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
>>>>>>> 4b44343085b49e8eb524666701b05d46824dcd04

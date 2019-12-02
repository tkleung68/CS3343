
public class LogoutAccount implements Command{
	@Override
	public void execute(String[] cmdParts) {
		ShopSystem shopSystem = ShopSystem.getInstance();
		try {
			if(shopSystem.accountLogOut())
				System.out.println("Sucessfully logged out! See you next time!");

		} catch (AccountIsEmptyException e) {
<<<<<<< HEAD
=======
			e.printStackTrace();
>>>>>>> 4b44343085b49e8eb524666701b05d46824dcd04
			System.out.println(e);
		}
	}
}

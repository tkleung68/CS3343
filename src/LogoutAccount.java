
public class LogoutAccount implements Command{
	@Override
	public void execute(String[] cmdParts) {
		ShopSystem shopSystem = ShopSystem.getInstance();
		if(shopSystem.accountLogOut()){
			System.out.println("Sucessfully logged out! See you next time!");
			}
		else 
		{
			System.out.println("Error! you have already logged out!");
		}
	}
}

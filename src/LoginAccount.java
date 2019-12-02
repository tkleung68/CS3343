
public class LoginAccount implements Command{
	@Override
	public void execute(String[] cmdParts) {
		try {
			if(cmdParts.length < 3) {
				throw new InsufficientParameterException();
			}
			String id = cmdParts[1];
			String password = cmdParts[2];
			ShopSystem shopSystem = ShopSystem.getInstance();
			Account account = shopSystem.accountLogin(id, password);
			if (account != null) {
				System.out.println("Successfully login, Welcome " + account.getName() + "!");
			}
<<<<<<< HEAD
		} catch (Exception e) {
=======
			else {
				System.out.println("Account not found! Check your userID and password!");
			}
		} catch (Exception e) {
			e.printStackTrace();
>>>>>>> 4b44343085b49e8eb524666701b05d46824dcd04
			System.out.println(e.getMessage());
		}
		
	}

}

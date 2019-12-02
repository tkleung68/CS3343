
public class NoSuchAccountException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoSuchAccountException() {
<<<<<<< HEAD
		super("Account not found! Check your userID and password!");
=======
		super("No such Account!");
>>>>>>> 4b44343085b49e8eb524666701b05d46824dcd04
	}
	
	public NoSuchAccountException(String message) {
		super(message);
	}
}



public abstract class Account {
	private String userID;
	private String password;
	
	public Account(String uID, String pw) {
		userID = uID;
		password = pw;
	}
	
	public boolean login(String uID, String pw) {
		return (userID.equals(uID)) && (password.equals(pw));
	}

	protected abstract void runOperation();
	
	
}

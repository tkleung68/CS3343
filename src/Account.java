

public abstract class Account {
	private String userID;
	private String password;
	private String name;
	
	public Account(String uID, String pw, String n) {
		userID = uID;
		password = pw;
		name = n;
	}
	
	public boolean login(String uID, String pw) {
		return (userID.equals(uID)) && (password.equals(pw));
	}
	
	public boolean matchUserID(String uID) {
		return userID.equals(uID);
	}


	public String getName() {
		return name;
	}
	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}
	public abstract String toString();
}

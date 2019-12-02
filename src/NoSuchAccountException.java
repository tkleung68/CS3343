
public class NoSuchAccountException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoSuchAccountException() {
		super("No such Account!");
	}
	
	public NoSuchAccountException(String message) {
		super(message);
	}
}

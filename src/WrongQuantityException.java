
public class WrongQuantityException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WrongQuantityException() {
		super("Wrong quantity");
	}
	
	public WrongQuantityException(String message) {
		super(message);
	}

}

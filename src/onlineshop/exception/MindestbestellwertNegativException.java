package onlineshop.exception;

@SuppressWarnings("serial")
public class MindestbestellwertNegativException extends Exception {
	public MindestbestellwertNegativException() {
		super("Der Mindestbestellwert ist negativ.");
	}
	
	public MindestbestellwertNegativException(String message) {
		super(message);
	}
}

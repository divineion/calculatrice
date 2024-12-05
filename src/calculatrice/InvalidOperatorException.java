package calculatrice;
/**
 * Thrown to indicate that an invalid operator has been used in a calculation.
 * 
 */
public class InvalidOperatorException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidOperatorException(String s) {
		super(s);
	}
}

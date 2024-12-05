package calculatrice;

/**
 * Utility class that stores messages as final static variables.
 * <p>
 * This class cannot be instantiated. Attempting to instantiate it will throw an {@link AssertionError}
 * </p>
 */
public final class ApplicationMessages {
	
	private ApplicationMessages() {
		throw new AssertionError("This class should not be instantiated");
	}
	
	public static final String ILLEGAL_OPERATOR_ERROR = " : opérateur incorrect ; les opérateurs valides sont +, -, *, / \n Veuillez rectifier votre saisie.";

	public static final String MULTIPLICATION_BY_ZERO_ERROR = "Erreur -> La multiplication par 0 est impossible";
	public static final String DIVISION_BY_ZERO_ERROR = "Erreur -> La division par 0 est impossible";
}

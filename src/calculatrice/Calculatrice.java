package calculatrice;

/**
 * This class represents a basic calculator capable of performing addition, subtraction,
 * multiplication, and division with error handling for invalid operators.
 */
public class Calculatrice {
    /**
     * @param operator the arithmetic operator to apply (<code>'+'</code>, <code>'-'</code>, <code>'*'</code>, <code>'/'</code>)
     * @param var1 the first operand
     * @param var2 the second operand
     * @return a formatted string representing the calculation result
     * @throws IllegalOperatorException if the operator is invalid
     * @throws IllegalArgumentException if multiplication or division involves zero
     * 
     * Performs a calculation based on the specified operator and operands.
     * <p>
     * The result is formatted as a string that shows the calculation in the form:
     * <code>operand1 operator operand2 = result</code>. For example:
     * <code>15 + 3 = 45.00</code>
     * </p>
     * <p>
     * Special cases:
     * <ul>
     *   <li>Throws {@link IllegalArgumentException} if a multiplication or division involves zero.</li>
     *   <li>Throws {@link InvalidOperatorException} if an unsupported operator is used.</li>
     * </ul>
     * </p>
     * @see ApplicationMessages
     */
	public String calculate(char operator, double var1, double var2) throws InvalidOperatorException {		
		var result = switch (operator) {
			case '+' -> String.format("%.0f", var1) + " " + operator + " " + String.format("%.0f", var2) + " = " + String.format("%.2f", (var1 + var2));
			case '-' -> String.format("%.0f", var1) + " " + operator + " " + String.format("%.0f", var2) + " = " + String.format("%.2f", (var1 - var2));
			case '*' -> {
				if (var1 == 0 || var2 == 0) {
					throw new IllegalArgumentException(var1 + " " + operator + " " + var2 + "\n" +ApplicationMessages.MULTIPLICATION_BY_ZERO_ERROR);
				}
				else {
					yield String.format("%.0f", var1) + " " + operator + " " + String.format("%.0f", var2) + " = " + String.format("%.2f", (var1 * var2));
				}
			}
			case '/' -> {
				if (var1 == 0 || var2 == 0) {
					throw new IllegalArgumentException(var1 + " " + operator + " " + var2 + "\n" + ApplicationMessages.DIVISION_BY_ZERO_ERROR);
				}
				yield String.format("%.0f", var1) + " " + operator + " " + String.format("%.0f", var2) + " = " + String.format("%.2f", (var1 / var2));
			}
		default -> throw new InvalidOperatorException("Erreur -> " + operator + ApplicationMessages.ILLEGAL_OPERATOR_ERROR);
		};
		
		return result;
	}
}

package calculatrice;

/**
 * Main class to demonstrate the usage of the {@link Calculatrice} class.
 * <p>
 * This program performs several calculations using the {@link Calculatrice#calculate(char, double, double)} 
 * method and handles potential exceptions.
 * </p>
 * <p>
 * Each calculation is wrapped in a try-catch block to handle the {@link InvalidOperatorException}.
 * Results are printed to the console.
 * </p>
 * 
 * @see Calculatrice
 * @see InvalidOperatorException
 */
public class Main {
	public static void main(String[] args) {
		Calculatrice calc = new Calculatrice();
		
		try {
			System.out.println(calc.calculate('z', 0, 7));
		} catch(InvalidOperatorException e) {
			System.out.println(e);
		}
		try {
			System.out.println(calc.calculate( '-', 2078, 64 ));
		} catch(InvalidOperatorException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(calc.calculate( '*', 15, 3 ));
		} catch(InvalidOperatorException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(calc.calculate('/', 42, 0));
		} catch(InvalidOperatorException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(calc.calculate('/', 42, 9));
		} catch(InvalidOperatorException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(calc.calculate('/', 15, 2));
		} catch(InvalidOperatorException e) {
			e.printStackTrace();
		}
		
	}

}

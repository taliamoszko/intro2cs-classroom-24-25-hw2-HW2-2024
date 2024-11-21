// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
        if (args.length != 1) {
            System.out.println("Please provide the number of terms as a command-line argument.");
            return; 
        }

        try {
            int numTerms = Integer.parseInt(args[0]);

            if (numTerms <= 0) {
                System.out.println("Please provide a positive integer for the number of terms.");
                return;
            }

            double approximatedPi = 0.0;

            for (int i = 0; i < numTerms; i++) {
               
                double term = 1.0 / (2 * i + 1);
                if (i % 2 == 0) {
                    approximatedPi += term;  
                } else {
                    approximatedPi -= term;  
                }
            }

            approximatedPi *= 4;

            System.out.println("pi according to Java: " + Math.PI);

            System.out.println("pi, approximated: " + approximatedPi);
            
        } catch (NumberFormatException e) {
            System.out.println("Please provide a valid integer for the number of terms.");
        }
    }
}

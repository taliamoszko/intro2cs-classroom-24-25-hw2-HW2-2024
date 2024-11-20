// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
        if (args.length != 2) {
            System.out.println("Usage: java Cheers <string> <N>");
            return;
        }
        
        String input = args[0];
        int N = Integer.parseInt(args[1]);

        String specialChars = "AEFHIILMNORSX";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (specialChars.indexOf(ch) != -1) {
                System.out.println("Give me an " + ch + ": " + ch + "!");
            } else {
                System.out.println("Give me a " + ch + ": " + ch + "!");
            }
        }

        System.out.println("What does that spell?");
        for (int i = 0; i < N; i++) {
            System.out.println(input + "!!!");
        }
    }
}


    
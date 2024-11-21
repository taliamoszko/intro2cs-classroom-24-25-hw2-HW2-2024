
public class Collatz {
	public static void main(String args[]) {
	    // Replace this comment with your code
        if (args.length != 2) {
            System.out.println("Usage: java Collatz <N> <mode>");
            return;
        }

        int N = Integer.parseInt(args[0]);
        String mode = args[1];

        if (!mode.equals("v") && !mode.equals("c")) {
            System.out.println("Invalid mode. Please use 'v' for verbose or 'c' for concise.");
            return;
        }

        for (int seed = 1; seed <= N; seed++) {
            if (mode.equals("v")) {
                printHailstoneSequence(seed);
            } else {
                int steps = printHailstoneSequenceConcise(seed);
                System.out.println("Seed " + seed + ": reached 1 (" + steps + ")");
            }
        }

        if (mode.equals("v")) {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        } else if (mode.equals("c")) {
            System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
        }
    }

    public static void printHailstoneSequence(int seed) {
        int steps = 0;
        int current = seed;

        System.out.print(seed + " ");
        while (current != 1) {
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = 3 * current + 1;
            }
            steps++;
            System.out.print(current + " ");
        }
        System.out.println("(" + steps + ")");
    }

    public static int printHailstoneSequenceConcise(int seed) {
        int steps = 0;
        int current = seed;

        while (current != 1) {
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = 3 * current + 1;
            }
            steps++;
        }
        return steps; 
    }
}

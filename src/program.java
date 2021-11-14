import exercises.recursion.FibonacciSequence;

public class program {

    public static void main (String[] args) {

        try {

            System.out.println("\n ------ Fibonacci -------- ");
            System.out.println(FibonacciSequence.fibonacciFormated(8));

        } catch (Exception err) {
            System.err.println(err.getStackTrace());
        }

    }
}

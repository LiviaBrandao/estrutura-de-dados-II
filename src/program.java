import exercises.recursion.FibonacciSequence;
import exercises.recursion.ListOfNumbers;
import exercises.recursion.SequenceOfNumbers;

public class program {

    public static void main (String[] args) throws Exception {

        try {

            System.out.println("\n ------ Fibonacci -------- ");
            System.out.println(FibonacciSequence.fibonacciFormated(8));

        } catch (Exception err) {
            System.err.println(err.getStackTrace());
        }

        try {
            System.out.println("\n ------ Sequence of numbers till number 0  -------- ");
            ListOfNumbers.decreaseFormattedToZeroFrom(7);

        } catch (Exception err) {
            System.out.println("Number out bonderies");
        }

        try {
            System.out.println("\n ------ Increasing sequence of numbers -------- ");
            SequenceOfNumbers.numberSequenceTo(10);
            System.out.println(SequenceOfNumbers.vectorNumberSequence());

        } catch (Exception err) {
            System.out.println("" + SequenceOfNumbers.vectorNumberSequence());
        }

    }

    public static int anyMethod (int n) throws Exception {

        //Excess�o, n�o sei como tratar
        if(n < 0)
            throw new Exception();
        //Solu��o conhecida
        if(n == 0)
            return 1;


        System.out.println(n + ", ");
        //Processo de simpl. recusao
        return (anyMethod(n-1));
    }
}

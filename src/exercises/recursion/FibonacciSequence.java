package exercises.recursion;

public class FibonacciSequence {

    private static int n;

    public static int fibonacci (int n) throws Exception {
        if(n < 0)
            throw new Exception();
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;

        FibonacciSequence.n = n;
        return(fibonacci(n - 1) + (fibonacci(n - 2)));
    }

    public static String fibonacciFormated (int n) throws Exception{
        int aux = 0;
        String ret = "[";

        while (aux < n){
            ret += fibonacci(aux) + ", ";
            aux++;
        }
        return ret += fibonacci(aux) + "]";
    }

    public String toString() {
        String ret = " " + n;
        return ret ;
    }
}

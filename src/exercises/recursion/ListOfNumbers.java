package exercises.recursion;

public class ListOfNumbers {

    private static int n;

    public static int decreaseToZeroFrom(int n) throws Exception {
        System.out.println(n + ", ");
        if (n == 0)
            throw new Exception();

        ListOfNumbers.n = n;
        return decreaseToZeroFrom(decreaseToZeroFrom(n - 1 ));
    }

    public static String decreaseFormattedToZeroFrom(int n) throws Exception {
        String ret = "[";

        for(int num = n; num < 0; n--)
            ret += decreaseToZeroFrom(num) + ", ";

        return ret += "]";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

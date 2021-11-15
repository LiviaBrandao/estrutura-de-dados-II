package exercises.recursion;

public class SequenceOfNumbers {
    private static int[] vet;

    public static int numberSequenceTo (int size) throws Exception {
        int aux = 0;

        if (aux > size)
            throw new Exception();
        if (aux == size)
            return aux;

        SequenceOfNumbers.vet[aux] = aux;
        return numberSequenceTo(numberSequenceTo(aux++));
    }

    public static int[] vectorNumberSequence() throws Exception {
        return SequenceOfNumbers.vet;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

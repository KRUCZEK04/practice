public class Training {

    /**
     * The Fibonacci sequence is a series of numbers where each number (known as a Fibonacci number)
     * is the sum of the two preceding ones, usually starting with 0 and 1.
     * <p>
     * Therefore, the sequence starts: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on.
     *
     * @param numberOfElements of elements in Fibonacci sequence to generate. Cannot be neagative
     * @return array of Fibonacci numbers
     */
    public int[] generateFibonacci(int numberOfElements) {
        if (numberOfElements < 0 ){
            throw new IllegalArgumentException("Number of terms should be greater than zero.");
        }
        int[] lengthOfElements = new int[numberOfElements];
        if (numberOfElements != 0) {
            lengthOfElements[0] = 0;
            for (int i = 2; i < numberOfElements; i++) {
                lengthOfElements[1] = 1;
                lengthOfElements[i] = lengthOfElements[i - 1] + lengthOfElements[i - 2];


            }

        }
        return lengthOfElements;
    }
}

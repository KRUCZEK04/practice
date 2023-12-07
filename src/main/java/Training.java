import java.util.Arrays;
import java.util.OptionalInt;

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
        return null;
    }

    /**
     * FizzBuzz is a classic programming problem where you print the numbers from 1 to n, but for multiples of 3, print
     * "Fizz" instead of the number, and for multiples of 5, print "Buzz".
     * For numbers which are multiples of both three and five, print "FizzBuzz".
     *
     * @param n number of elements from 1 to n
     * @return n or Fizz or Buzz or FizzBuzz on specific array index
     */
    public String[] fizzBuzz(int n) {
        return null;
    }

    /**
     * Should find the max number in array
     *
     * @param array to find in
     * @return max number
     */
        public int findMax(int[] array) {
            if (array == null) {
                throw new IllegalArgumentException("Array must not be null or empty.");
            }

            if (array.length == 0) {
                throw new IllegalArgumentException("Array must not be null or empty.");
            }
                int maxNumber = array[0];
                for (int i = 1; i < array.length; i++) {
                    if (array[i] > maxNumber) {
                        maxNumber = array[i];
                    }
                }

                return maxNumber;

        }
    /**
     * A palindrome is a sequence of characters that reads the same forward as backward.
     * Palindrome: level, kayak, radar
     *
     * @param word to check
     * @return true if word is a palindrome, false if not
     */
    public boolean checkPalindrome(String word) {
            if (word == null){
                throw new IllegalArgumentException("Input string must not be null.");
            }
        String newString = word.replaceAll("\\s+", "").toLowerCase();

        // Porównanie znaków od początku i końca
        int start = 0;
        int end = newString.length() - 1;

        while (start < end) {
            if (newString.charAt(start) != newString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}

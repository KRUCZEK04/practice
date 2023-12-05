public class Training {

    /**
     * The Fibonacci sequence is a series of numbers where each number (known as a Fibonacci number)
     * is the sum of the two preceding ones, usually starting with 0 and 1.
     *
     * Therefore, the sequence starts: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on.
     *
     * @param numberOfElements of elements in Fibonacci sequence to generate. Cannot be neagative
     *
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
    public String[] fizzBuzz(int n){
        if(n <= 0){
            throw new IllegalArgumentException("Input should be a positive integer.");
        }
        String[] numbers = new String[n];
        for (int i = 1; i <= n; i++) {
            if (i%3 ==0 && i%5==0){
                numbers[i-1] = "FizzBuzz";
            }
            else if (i%3 ==0){
                numbers[i-1] = "Fizz";
            }
            else if (i%5 ==0){
                numbers[i-1] = "Buzz";
            }
           else numbers[i-1] = Integer.toString(i);
        }
        return  numbers;
    }
}

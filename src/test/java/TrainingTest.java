import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainingTest {

    private Training training;

    @BeforeEach
    void setUp() {
        training = new Training();
    }

    @Nested
    @Disabled
    class FibonacciTests {

        @Test
        void testGenerateFibonacciWithZeroTerms() {
            int[] result = training.generateFibonacci(0);
            assertEquals(0, result.length);
        }

        @Test
        void testGenerateFibonacciWithOneTerm() {
            int[] result = training.generateFibonacci(1);
            assertEquals(1, result.length);
            assertEquals(0, result[0]);
        }

        @Test
        void testGenerateFibonacciWithCoupleTerms() {
            int[] result = training.generateFibonacci(7);
            assertEquals(5, result.length);
            assertEquals(0, result[0]);
            assertEquals(1, result[1]);
            assertEquals(1, result[2]);
            assertEquals(2, result[3]);
            assertEquals(3, result[4]);
            assertEquals(5, result[5]);
            assertEquals(8, result[6]);
        }

        @Test
        void testGenerateFibonacciWithThirtyTerms() {
            int[] result = training.generateFibonacci(30);
            assertEquals(30, result.length);

            // Verify some specific Fibonacci numbers within the sequence
            assertEquals(0, result[0]);
            assertEquals(1, result[1]);
            assertEquals(1, result[2]);
            assertEquals(2, result[3]);
            assertEquals(3, result[4]);
            assertEquals(5, result[5]);
            assertEquals(8, result[6]);
            assertEquals(13, result[7]);
            assertEquals(21, result[8]);
            assertEquals(34, result[9]);
            assertEquals(55, result[10]);
            assertEquals(89, result[11]);
            assertEquals(144, result[12]);
            assertEquals(233, result[13]);
            assertEquals(377, result[14]);
            assertEquals(610, result[15]);
            assertEquals(987, result[16]);
            assertEquals(1597, result[17]);
            assertEquals(2584, result[18]);
            assertEquals(4181, result[19]);
            assertEquals(6765, result[20]);
            assertEquals(10946, result[21]);
            assertEquals(17711, result[22]);
            assertEquals(28657, result[23]);
            assertEquals(46368, result[24]);
            assertEquals(75025, result[25]);
            assertEquals(121393, result[26]);
            assertEquals(196418, result[27]);
            assertEquals(317811, result[28]);
            assertEquals(514229, result[29]);
        }

        @Test
        void testGenerateFibonacciWithNegativeTerms() {
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                    () -> training.generateFibonacci(-3));
            assertEquals("Number of terms should be greater than zero.", exception.getMessage());
        }
    }

    @Nested
    @Disabled
    class FizzBuzzTests {

        @Test
        void testFizzBuzzWithFive() {
            String[] result = training.fizzBuzz(5);
            assertArrayEquals(new String[]{"1", "2", "Fizz", "4", "Buzz"}, result);
        }

        @Test
        void testFizzBuzzWithFifteen() {
            String[] result = training.fizzBuzz(15);
            assertArrayEquals(new String[]{
                    "1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz",
                    "11", "Fizz", "13", "14", "FizzBuzz"
            }, result);
        }

        @Test
        void testFizzBuzzWithOne() {
            String[] result = training.fizzBuzz(1);
            assertArrayEquals(new String[]{"1"}, result);
        }

        @Test
        void testFizzBuzzWithNegativeInput() {
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                    () -> training.fizzBuzz(-3));
            assertEquals("Input should be a positive integer.", exception.getMessage());
        }

    }

    @Nested
    class MaxTest {

        @Test
        void testFindMaxWithPositiveNumbers() {
            int[] array = {5, 2, 9, 1, 7};
            int result = training.findMax(array);
            assertEquals(9, result);
        }

        @Test
        void testFindMaxWithNegativeNumbers() {
            int[] array = {-5, -2, -9, -1, -7};
            int result = training.findMax(array);
            assertEquals(-1, result);
        }

        @Test
        void testFindMaxWithMixedNumbers() {
            int[] array = {-5, 2, 9, -1, 7};
            int result = training.findMax(array);
            assertEquals(9, result);
        }

        @Test
        void testFindMaxWithSingleElement() {
            int[] array = {3};
            int result = training.findMax(array);
            assertEquals(3, result);
        }

        @Test
        void testFindMaxWithEmptyArray() {
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                    () -> training.findMax(new int[]{}));
            assertEquals("Array must not be null or empty.", exception.getMessage());
        }

        @Test
        void testFindMaxWithNullArray() {
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                    () -> training.findMax(null));
            assertEquals("Array must not be null or empty.", exception.getMessage());
        }
    }

    @Nested
    class PalindromeTest{

        @Test
        void testIsPalindromeWithPalindromeString() {
            assertTrue(training.checkPalindrome("level"));
        }

        @Test
        void testIsPalindromeWithNonPalindromeString() {
            assertFalse(training.checkPalindrome("hello"));
        }

        @Test
        void testIsPalindromeWithEmptyString() {
            assertTrue(training.checkPalindrome(""));
        }

        @Test
        void testIsPalindromeWithSingleCharacterString() {
            assertTrue(training.checkPalindrome("a"));
        }

        @Test
        void testIsPalindromeWithMixedCaseString() {
            assertTrue(training.checkPalindrome("Madam"));
        }

        @Test
        void testIsPalindromeWithNullString() {
            IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                    () -> training.checkPalindrome(null));
            assertEquals("Input string must not be null.", exception.getMessage());
        }
    }

}
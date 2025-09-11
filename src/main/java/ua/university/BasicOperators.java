package ua.university;


import java.util.Arrays;

/**
 * BasicOperators class contains a set of static methods
 * for practicing Java operators, loops, arrays, and branching.
 */
public class BasicOperators {

    /**
     * Returns the sum and average of three integers.
     *
     * @param a first integer
     * @param b second integer
     * @param c third integer
     * @return double array where [0] = sum, [1] = average
     */
    public static double[] sumAndAverage(int a, int b, int c) {

        int sum = a + b+ c;
        int average = sum/ 3;
        return new double[]{sum, average};

    }

    /**
     * Returns the maximum of three integers.
     */


    public static int maxOfThree(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    /**
     /**
     * Returns the corresponding grade letter for a given numeric score.
     * <p>
     * The grading scale is as follows:
     * <ul>
     *     <li>90–100: 'A'</li>
     *     <li>80–89:  'B'</li>
     *     <li>70–79:  'C'</li>
     *     <li>60–69:  'D'</li>
     *     <li>50–59:  'E'</li>
     *     <li>0–49:   'F'</li>
     * </ul>
     *
     * @param score the numeric score, expected to be between 0 and 100 inclusive
     * @return the grade letter corresponding to the given score
     * @throws IllegalArgumentException if {@code score} is less than 0 or greater than 100
     */
    public static char gradeFromScore(int score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Оцінка має бути від 0 до 100.");
        }
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else if (score >= 60) return 'D';
        else if (score >= 50) return 'E';
        else return 'F';

    }

    /**
     * Returns the day of the week name for a number 1-7.
     */
    public static String dayOfWeek(int day) {
        if (day < 1 || day > 7) {
            throw new IllegalArgumentException("Оцінка має бути від 0 до 100.");
        }
        if (day == 1) return "Monday";
        else if (day == 2) return "Tuesday";
        else if (day == 3) return "Wednesday";
        else if (day == 4) return "Thursday";
        else if (day == 5) return "Friday";
        else if (day == 6) return "Saturday";
        else if (day == 7) return "Sunday";
        return "Unknown";
    }

    /**
     ;   * Returns an array counting down from n to 1.
     */
    public static int[] countdown(int n) {
        if (n < 1){
            throw new IllegalArgumentException("");
        }

        int[] result = new int[n];
        for (int i = n, j = 0; i >= 1; i--, j++) {
            result[j] = i;
        }
        return result;
    }

    /**
     * Returns factorial of n.
     */
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers: " + n);
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    /**
     * Returns a reversed copy of the array.
     */
    public static int[] reverseArray(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Пустий масив");
        }

        int[] reversedarray = new int[arr.length];
        for (int i = 0; i <  arr.length; i++) {
            reversedarray[i] = arr[arr.length - 1 - i];
        }

        return reversedarray;
    }

    /**
     * Returns sum of all elements in a 2D array (matrix).
     */
    public static int sumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            throw new IllegalArgumentException("");
        }

        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    /**
     * Checks if a string is a palindrome.
     */
    public static boolean isPalindrome(String s) {
        if  (s == null || s.length() == 0) {
            throw new IllegalArgumentException();
        }

        char [] reversedarray = new char[s.length()];
        for (int i = 0; i <  s.length(); i++) {
            reversedarray[i] = s.charAt(s.length() - 1 - i);
        }

        return s.equals(new String(reversedarray));
    }

    /**
     * Returns minimum and maximum of an array.
     */
    public static int[] findMinMax(int[] arr) {

        if  (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Масив пустий");
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[]{min, max};
    }

    /**
     * Returns multiplication table n x n.
     */
    public static int[][] multiplicationTable(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("");
        }

        int[][] table = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }

        return table;
    }

    /**
     * Returns all even numbers up to n.
     */
    public static int[] evenNumbersUpToN(int n) {

        int count = n / 2;
        int[] result = new int[count];

        for (int i = 0; i < count; i++) {
            result[i] = (i + 1) * 2;
        }

        return result;

    }

    /**
     * Checks if a number is prime.
     */
    public static boolean isPrime(int n) {

        if (n < 2) {
            return false;
        }

        if (n == 2 || n == 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Counts vowels in a string.
     */
    public static int countVowels(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'e') {
                count++;
            }
        }
        return count;
    }

    /**
     * Returns first n Fibonacci numbers.
     */
    public static int[] fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("");
        }

        // Створюємо масив для результату
        int[] fib = new int[n];

        fib[0] = 0;

        if (n > 1) {
            fib[1] = 1;

            for (int i = 2; i < n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
        }

        return fib;
    }

    /**
     * Returns the transpose of a 2D array (matrix).
     */
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transposed = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }

        return transposed;
    }

    /**
     * Returns a sorted copy of the array in ascending order.
     */
    public static int[] sortArray(int[] arr) {
        int[] copy = Arrays.copyOf(arr, arr.length);
        Arrays.sort(copy);
        return copy;

    }

}
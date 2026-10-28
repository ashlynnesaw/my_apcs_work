public class SumOfSquares {

    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void testSumOfSquares(int n, int expected) {
        int result = sumOfSquares(n);

        System.out.print("n:" + n + " expected:" + expected + " result:" + result + " ");

        if (result == expected) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        testSumOfSquares(1, 1);
        testSumOfSquares(2, 5);
        testSumOfSquares(3, 14);
    }
}

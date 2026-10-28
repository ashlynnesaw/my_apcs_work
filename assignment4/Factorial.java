public class Factorial {

    public static int factorial(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void testFactorial(int n, int expected) {
        int result = factorial(n);

        System.out.print("n:" + n + " expected:" + expected + " result:" + result + " ");

        if (result == expected) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        testFactorial(0, 1);
        testFactorial(3, 6);
        testFactorial(5, 120);
    }
}

public class FibonacciSequence {
    public static void main(String[] args) {
        int terms = 30;
        int a = 1;
        int b = 1;

        System.out.println("First 30 terms of the Fibonacci sequence:");
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + (i < terms ? ", " : "\n"));

            int temp = a + b;
            a = b;
            b = temp;
        }
    }
}

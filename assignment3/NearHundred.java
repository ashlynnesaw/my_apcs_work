public class NearHundred {

    public static boolean nearHundred(int n) {
        return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
    }

    public static void testNearHundred(int n, boolean expected) {
        boolean result = nearHundred(n);

        System.out.print("n:" + n + " expected:" + expected + " result:" + result + " ");

        if (result == expected) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        testNearHundred(93, true);
        testNearHundred(90, true);
        testNearHundred(89, false);
    }
}

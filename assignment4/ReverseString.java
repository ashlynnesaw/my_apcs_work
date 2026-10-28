public class ReverseString {

    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static void testReverse(String str, String expected) {
        String result = reverse(str);

        System.out.print("str:" + str + " expected:" + expected + " result:" + result + " ");

        if (result.equals(expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        testReverse("bad", "dab");
        testReverse("Hello, world!", "!dlrow ,olleH");
        testReverse("tacocat", "tacocat");
    }
}

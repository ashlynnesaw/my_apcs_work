public class Attention {

    public static boolean attention(String str) {
        return str.startsWith("Hey, you!");
    }

    public static void testAttention(String str, boolean expected) {
        boolean result = attention(str);

        System.out.print("str:" + str + "expected:" + expected + " result:" + result + " ");

        if (result == expected) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        testAttention("Hello, my name is Inigo Montoya.", false);
        testAttention("Excuse me, Dr. Kessner?", false);
        testAttention("Hey, you! Give me your code!", true);
    }
}

public class Attention {
    public static boolean attention(String str) {
        return str.startsWith("Hey, you!");
    }

    public static void main(String[] args) {
        if (attention("Hello, my name is Inigo Montoya.") == false) {
            System.out.println("Test 1: PASS");
        } else {
            System.out.println("Test 1: FAIL");
        }

        if (attention("Excuse me, Dr. Kessner?") == false) {
            System.out.println("Test 2: PASS");
        } else {
            System.out.println("Test 2: FAIL");
        }

        if (attention("Hey, you! Give me your code!") == true) {
            System.out.println("Test 3: PASS");
        } else {
            System.out.println("Test 3: FAIL");
        }
    }
}

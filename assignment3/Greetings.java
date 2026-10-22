public class Greetings {
    public static String greetings(String name) {
        return "Hello, " + name + ", how are you?";
    }

    public static void main(String[] args) {
        if (greetings("Dr. Kessner").equals("Hello, Dr. Kessner, how are you?")) {
            System.out.println("Test 1: PASS");
        } else {
            System.out.println("Test 1: FAIL");
        }

        if (greetings("Ascii Cat").equals("Hello, Ascii Cat, how are you?")) {
            System.out.println("Test 2: PASS");
        } else {
            System.out.println("Test 2: FAIL");
        }

        if (greetings("Sydneys").equals("Hello, Sydneys, how are you?")) {
            System.out.println("Test 3: PASS");
        } else {
            System.out.println("Test 3: FAIL");
        }
    }
}

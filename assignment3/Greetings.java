public class Greetings {

    public static String greetings(String name) {
        return "Hello, " + name + ", how are you?";
    }

    public static void testGreetings(String name, String expected) {
        String result = greetings(name);

        System.out.print("name: " + name +  "expected: " + expected + "result: " + result);

        if (result.equals(expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        testGreetings("Dr. Kessner", "Hello, Dr. Kessner, how are you?");
        testGreetings("Ascii Cat", "Hello, Ascii Cat, how are you?");
        testGreetings("Sydneys", "Hello, Sydneys, how are you?");
    }
}

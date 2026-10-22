public class EndUpProgram {
    public static String endUp(String str) {
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        int cut = str.length() - 3;
        String front = str.substring(0, cut);
        String back = str.substring(cut);
        return front + back.toUpperCase();
    }

    public static void main(String[] args) {
        if (endUp("Hello").equals("HeLLO")) {
            System.out.println("Test 1: PASS");
        } else {
            System.out.println("Test 1: FAIL");
        }

        if (endUp("hi there").equals("hi thERE")) {
            System.out.println("Test 2: PASS");
        } else {
            System.out.println("Test 2: FAIL");
        }

        if (endUp("hi").equals("HI")) {
            System.out.println("Test 3: PASS");
        } else {
            System.out.println("Test 3: FAIL");
        }
    }
}

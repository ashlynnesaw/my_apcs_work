public class CodingBatParrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public static void main(String[] args) {
        if (parrotTrouble(true, 6) == true) {
            System.out.println("Test 1: PASS");
        } else {
            System.out.println("Test 1: FAIL");
        }

        if (parrotTrouble(true, 7) == false) {
            System.out.println("Test 2: PASS");
        } else {
            System.out.println("Test 2: FAIL");
        }

        if (parrotTrouble(false, 6) == false) {
            System.out.println("Test 3: PASS");
        } else {
            System.out.println("Test 3: FAIL");
        }
}
}

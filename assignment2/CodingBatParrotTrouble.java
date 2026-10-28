public class CodingBatParrotTrouble {

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public static void testParrotTrouble(boolean talking, int hour, boolean expected) {
        boolean result = parrotTrouble(talking, hour);

        System.out.print("talking:" + talking + " hour:" + hour + " expected:" + expected + " result:" + result + " ");

        if (result == expected) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        testParrotTrouble(true, 6, true);
        testParrotTrouble(true, 7, false);
        testParrotTrouble(false, 6, false);
        testParrotTrouble(true, 21, true);
        testParrotTrouble(false, 21, false);
        testParrotTrouble(false, 20, false);
    }
}

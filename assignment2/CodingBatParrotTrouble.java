public class CodingBatParrotTrouble {

    public static boolean ParrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public static void testParrotTrouble(boolean talking, int hour, boolean expected) {
        boolean actual = ParrotTrouble(talking, hour);
        if (actual == expected) {
            System.out.println("parrotTrouble(" + talking + ", " + hour + ") -> Expected: " + expected + ", Got: " + actual + " PASS");
        } else {
            System.out.println("parrotTrouble(" + talking + ", " + hour + ") -> Expected: " + expected + ", Got: " + actual + " FAIL");
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

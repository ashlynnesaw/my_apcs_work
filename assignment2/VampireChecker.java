public class VampireChecker {

    public static boolean isVampire(float hour, boolean awake) {
        if (hour >= 6.f && hour <= 22f) {
            return !awake;
        } else {
            return awake;
        }
    }    

    public static void VampireTest(float hour, boolean awake, boolean expected) {
        boolean result = isVampire(hour, awake);

        System.out.print("hour:" + hour + " awake:" + awake + " expected:" + expected + " result:" + result + " ");

        if (result == expected) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        VampireTest(12f, false, true);
        VampireTest(12f, true, false);
        VampireTest(3f, true, true);
    }
}

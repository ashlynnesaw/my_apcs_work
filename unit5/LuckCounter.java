public class LuckCounter {
    public static int countLucky(int[] nums) {
        int count = 0;
        for (int num: nums) {
            if (num % 7 == 0 || Math.abs(num) % 10 == 7) {
                count++;
            }
        }
        return count;
    }
}

class LuckyCounterTest {
    public static void main(String[] args) {
        if (LuckCounter.countLucky(new int[]{1, 2, 3}) == 0) {
            System.out.println("Test 1: PASS");
        } else {
            System.out.println("Test 1: FAIL");
        }

        if (LuckCounter.countLucky(new int[]{7, 13, 17}) == 2) {
            System.out.println("Test 2: PASS");
        } else {
            System.out.println("Test 2: FAIL");
        }

        if (LuckCounter.countLucky(new int[]{107, 207}) == 2) {
            System.out.println("Test 3: PASS");
        } else {
            System.out.println("Test 3: FAIL");
        }
    }
}

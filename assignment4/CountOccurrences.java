public class CountOccurrences {
    public static int countOccurrences(String str, String sub) {
        if (sub.length() == 0) return 0;
        int count = 0;
        int idx = 0;
        while ((idx = str.indexOf(sub, idx)) != -1) {
            count++;
            idx += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        if (countOccurrences("Mississippi", "iss") == 2) {
            System.out.println("Test 1: PASS");
        } else {
            System.out.println("Test 1: FAIL");
        }

        if (countOccurrences("banananana", "na") == 4) {
            System.out.println("Test 2: PASS");
        } else {
            System.out.println("Test 2: FAIL");
        }

        if (countOccurrences("hello world", "l") == 3) {
            System.out.println("Test 3: PASS");
        } else {
            System.out.println("Test 3: FAIL");
        }
    }
}

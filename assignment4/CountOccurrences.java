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

    public static void testCountOccurrences(String str, String sub, int expected) {
        int result = countOccurrences(str, sub);

        System.out.print("str:" + str + " sub:" + sub + " expected:" + expected + " result:" + result + " ");

        if (result == expected) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        testCountOccurrences("Mississippi", "iss", 2);
        testCountOccurrences("banananana", "na", 4);
        testCountOccurrences("hello world", "l", 3);
    }
}

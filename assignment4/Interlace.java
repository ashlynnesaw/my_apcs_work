public class Interlace {
    public static String interlace(String s1, String s2) {
        StringBuilder sb = new StringBuilder();
        int maxLen = Math.max(s1.length(), s2.length());
        for (int i = 0; i < maxLen; i++) {
            if (i < s1.length()) {
                sb.append(s1.charAt(i));
            }
            if (i < s2.length()) {
                sb.append(s2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        if (interlace("abc", "123").equals("a1b2c3")) {
            System.out.println("Test 1: PASS");
        } else {
            System.out.println("Test 1: FAIL");
        }

        if (interlace("bed", "ras").equals("breads")) {
            System.out.println("Test 2: PASS");
        } else {
            System.out.println("Test 2: FAIL");
        }

        if (interlace("hi", "bye").equals("hbiye")) {
            System.out.println("Test 3: PASS");
        } else {
            System.out.println("Test 3: FAIL");
        }
    }
}

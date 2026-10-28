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

    public static void testInterlace(String s1, String s2, String expected) {
        String result = interlace(s1, s2);

        System.out.print("s1:" + s1 + " s2:" + s2 + " expected:" + expected + " result:" + result + " ");

        if (result.equals(expected)) {
            System.out.println("PASS");
        } else {
            System.out.println("fAIL");
        }
    }

    public static void main(String[] args) {
        testInterlace("abc", "123", "a1b2c3");
        testInterlace("bed", "ras", "breads");
        testInterlace("hi", "bye", "hbiye");
    }
}

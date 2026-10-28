public class Store {

    public static boolean goodDeal(double ogPrice, double salePrice) {
        return salePrice < ogPrice * 0.75;
    }

    public static void testGoodDeal(double ogPrice, double salePrice, boolean expected) {
        boolean result = goodDeal(ogPrice, salePrice);

        System.out.print("ogPrice:" + ogPrice + " salePrice:" + salePrice + " expected:" + expected + " result:" + result + " ");

        if (result == expected) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }
    }

    public static void main(String[] args) {
        testGoodDeal(100, 70, true);
        testGoodDeal(100, 80, false);
        testGoodDeal(50, 35, true);
    }
}

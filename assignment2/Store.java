public class Store {

    public boolean goodDeal(double ogPrice, double salePrice) {
        return salePrice < ogPrice * 0.75;
    }

    public static void main(String[] args) {
        Store store = new Store();
        
        if (store.goodDeal(100, 70) == true) {
            System.out.println("Test 1: PASS");
        } else {
            System.out.println("Test 1: FAIL");
        }
        
        if (store.goodDeal(100, 80) == false) {
            System.out.println("Test 2: PASS");
        } else {
            System.out.println("Test 2: FAIL");
        }
        
        if (store.goodDeal(50, 35) == true) {
            System.out.println("Test 3: PASS");
        } else {
            System.out.println("Test 3: FAIL");
        }
    }
}

public class CoinFlip {
    public static String flipCoin() {
        return Math.random() < 0.5 ? "Heads" : "Tails";
    }

    public static void main(String[] args) {
        System.out.println("Running 10 coin flips to check output:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Flip " + i + ": " + flipCoin());
        }
    }
}

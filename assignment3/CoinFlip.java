public class CoinFlip {
    public static String flipCoin() {
        if (Math.random() < 0.5) {
            return "Heads";
        } else {
            return "Tails";
        }
    }

    public static void main(String[] args) {
        System.out.println("Running 10 coin flips to check output:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Flip " + i + ": " + flipCoin());
        }
    }
}

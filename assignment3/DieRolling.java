public class DieRolling {
    public static int rollDie() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        System.out.println("Rolling a 6-sided die 10 times:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Roll " + i + ": " + rollDie());
        }
    }
}

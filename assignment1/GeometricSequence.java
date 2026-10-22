public class GeometricSequence {
    public static void main(String[] args) {
        int terms = 10;
        int start = 3;
        int ratio = 2;

        System.out.println("Geometric sequence:");
        int current = start;
        for (int i = 1; i <= terms; i++) {
            System.out.print(current + (i < terms ? ", " : "\n"));
            current *= ratio;
        }
    }
}

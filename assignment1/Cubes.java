public class Cubes {
    public static void main(String[] args) {
        int terms = 10; // Number of cubes to print

        System.out.println("Cubes of counting numbers:");
        for (int i = 0; i < terms; i++) {
            int cube = i * i * i;
            System.out.print(cube + (i < terms - 1 ? ", " : "\n"));
        }
    }
}

public class Multiples {
    public static void main(String[] args) {
        System.out.println("Multiples of 2, 3, and 7 between 71 and 150:");
        for (int i = 71; i <= 150; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " (multiple of 2) ");
            }
            if (i % 3 == 0) {
                System.out.print(i + " (multiple of 3) ");
            }
            if (i % 7 == 0) {
                System.out.print(i + " (multiple of 7) ");
            }
            System.out.println();
        }
    }
}


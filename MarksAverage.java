import java.util.Scanner;

public class MarksAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the marks for Unit 1: ");
        double unit1 = scanner.nextDouble();

        System.out.print("Enter the marks for Unit 2: ");
        double unit2 = scanner.nextDouble();

        System.out.print("Enter the marks for Unit 3: ");
        double unit3 = scanner.nextDouble();

        System.out.print("Enter the marks for Unit 4: ");
        double unit4 = scanner.nextDouble();

        System.out.print("Enter the marks for Unit 5: ");
        double unit5 = scanner.nextDouble();

        double average = (unit1 + unit2 + unit3 + unit4 + unit5) / 5;

        System.out.printf("The average marks is: %.2f%n", average);
    }
}

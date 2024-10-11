import java.util.Scanner;

public class DivisibilityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            if (number % i == 0) {
                System.out.println(number + " is divisible by " + i);
            } else {
                System.out.println(number + " is not divisible by " + i);
            }
        }

        // Special cases for divisibility by 2, 3, 4, 5, 6, 8, 9
        if (number % 2 == 0) {
            System.out.println(number + " is divisible by 2 because it ends with an even number.");
        }

        if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3 because the sum of its digits is divisible by 3.");
        }

        if (number % 4 == 0) {
            int lastTwoDigits = number % 100;
            if (lastTwoDigits % 4 == 0) {
                System.out.println(number + " is divisible by 4 because the last two digits (" + lastTwoDigits + ") are divisible by 4.");
            }
        }

        if (number % 5 == 0) {
            int lastDigit = number % 10;
            if (lastDigit == 0 || lastDigit == 5) {
                System.out.println(number + " is divisible by 5 because it ends with a " + lastDigit + ".");
            }
        }

        if (number % 6 == 0) {
            System.out.println(number + " is divisible by 6 because it is divisible by both 2 and 3.");
        }

        if (number % 8 == 0) {
            int lastThreeDigits = number % 1000;
            if (lastThreeDigits % 8 == 0) {
                System.out.println(number + " is divisible by 8 because the last three digits (" + lastThreeDigits + ") are divisible by 8.");
            }
        }

        if (number % 9 == 0) {
            int sumOfDigits = 0;
            int temp = number;
            while (temp > 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }
            if (sumOfDigits % 9 == 0) {
                System.out.println(number + " is divisible by 9 because the sum of its digits (" + sumOfDigits + ") is divisible by 9.");
            }
        }
    }
}

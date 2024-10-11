import java.util.Scanner;

public class Surname {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask for surname and age
        System.out.print("Enter your surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate and display the number of characters in the surname
        int nameLength = surname.length();
        System.out.println("The number of characters in your surname is: " + nameLength);

        // Check if age is even or odd
        if (age % 2 == 0) {
            System.out.println("Your current age is an even number.");
        } else {
            System.out.println("Your current age is an odd number.");
        }
    }
}


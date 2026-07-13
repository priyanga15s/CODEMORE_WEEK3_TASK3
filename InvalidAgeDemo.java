import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {

    // Constructor
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main Class
public class InvalidAgeDemo {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid. You are eligible.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            validateAge(age);

        } catch (InvalidAgeException e) {

            System.out.println("Custom Exception: " + e.getMessage());

        } catch (Exception e) {

            System.out.println("Invalid input. Please enter a valid integer.");

        } finally {

            sc.close();
            System.out.println("Program ended.");
        }
    }
}
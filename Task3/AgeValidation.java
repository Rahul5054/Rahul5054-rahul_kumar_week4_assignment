package Task3;

import java.util.Scanner;

// Custom Exception Class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeValidation {

    // Method to validate age
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 100) {
            throw new InvalidAgeException("Age must be between 0 and 120.");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();

            // Validate age
            validateAge(age);

            System.out.println("You entered a valid age : " + age);
        } catch (InvalidAgeException e) {
            System.out.println("Error : " + e.getMessage());
        } catch (Exception e) {
           // e.printStackTrace();
          System.out.println("Error : Invalid input. Please enter a number.");
        } finally {
            scanner.close();
        }
    }
}
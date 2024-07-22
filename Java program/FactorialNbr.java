import java.util.Scanner;

public class FactorialNbr {

    // Method to calculate factorial
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
  
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        

    
        while (true) {
            System.out.print("Enter a non-negative integer to calculate its factorial: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (number >= 0) {
                    break;
                } else {
                    System.out.println("Please enter a non negative integer");
                }
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }

        // Calculate factorial
        long fact = factorial(number);

        // Print the result
        System.out.println("The factorial of " + number + " is " + fact + ".");

        // Close the scanner
        scanner.close();
    }
}

import java.util.Scanner;

public class Armstrongnumbers {

    // Function to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = 0;

        // Find the number of digits in the number
        while (num != 0) {
            num /= 10;
            digits++;
        }

        num = originalNum;

        // Calculate the sum of the digits raised to the power of the number of digits
        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        // If the sum is equal to the original number, it's an Armstrong number
        return sum == originalNum;
    }

    // Function to print Armstrong numbers within a given range
    public static void printArmstrongNumbers(int start, int end) {
        System.out.println("Armstrong numbers between " + start + " and " + end + ":");
        for (int num = start; num <= end; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();  // To add a newline after printing the Armstrong numbers
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the range (start and end)
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        
        // Call the function to print Armstrong numbers in the range
        printArmstrongNumbers(start, end);
        
        // Close the scanner
        scanner.close();
    }
}

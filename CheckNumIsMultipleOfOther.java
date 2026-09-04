import java.util.Scanner;

public class CheckNumIsMultipleOfOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        // Handle zero division edge cases
        if (num1 == 0 || num2 == 0) {
            if (num1 == 0 && num2 == 0) {
                System.out.println("Both numbers are 0 (0 is a multiple of 0).");
            } else if (num1 == 0) {
                System.out.println("0 is a multiple of " + num2);
            } else {
                System.out.println("0 is a multiple of " + num1);
            }
        } else if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("One number is a multiple of the other.");
        } else {
            System.out.println("Neither number is a multiple of the other.");
        }

        sc.close();
    }
}
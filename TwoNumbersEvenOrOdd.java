import java.util.Scanner;

public class TwoNumbersEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        boolean isNum1Even = (num1 % 2 == 0);
        boolean isNum2Even = (num2 % 2 == 0);

        if (isNum1Even && isNum2Even) {
            System.out.println("Both are even numbers");
        } else if (!isNum1Even && !isNum2Even) {
            System.out.println("Both are odd numbers");
        } else {
            System.out.println("One is even and one is odd");
        }

        sc.close();
    }
}
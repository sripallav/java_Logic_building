import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PrimeNumberCheck pc = new PrimeNumberCheck();
        System.out.println(pc.primeNumberCheck(num));
    }
}

class PrimeNumberCheck {
    public String primeNumberCheck(int num) {

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return "prime";
        } else {
            return "not prime";
        }
    }
}
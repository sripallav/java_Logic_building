import java.util.Scanner;

public class SumNonZeroNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sumofnon sm = new sumofnon();
        sm.sumofnon(sc);
    }
}

class sumofnon {
    public void sumofnon(Scanner sc) {

        int sum = 0;

        for(int i = 1; i <= 5; i++) {

            System.out.print("Enter a num: ");
            int num = sc.nextInt();

            if(num == 0) {
                continue;
            }

            sum = sum + num;
        }

        System.out.println("Sum = " + sum);
    }
}
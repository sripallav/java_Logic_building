import java.util.Scanner;
public class ReadAndDisplayTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num 1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a num 2: ");
        int num2 = sc.nextInt();

        TwoNumbers TN = new TwoNumbers();
        TN.TwoNumbers(num1,num2);

    }
    
}

class TwoNumbers{
    public void TwoNumbers(int num1,int num2){

        System.out.println("num1 is: " + num1);
        System.out.println("num2 is: " + num2);

       
    }
}

import java.util.Scanner;
public class oddpalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;

        while(num>0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;

        }

        if(reverse == original && reverse%2!=0){
            System.out.print("it is a odd palindrome");
        }
        else{
            System.out.print("it is not a odd palindrome number");
        }
    }
}


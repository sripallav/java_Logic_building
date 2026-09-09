//Check if a number is a palindrome.
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        palindrome pm =  new palindrome();
        System.out.println(pm.palindrome(num));
        
        
    }
    
}

class palindrome{
    public String palindrome(int num){
        int original = num;
        int rev = 0;
        while(num>0){
            int digit = num%10;
            rev = rev* 10+digit;
            num = num/10;
        }

        if(rev==original){
            return "number is palindrome";

        }

        else{

            return "number is not palindrome";
        }
    }
}

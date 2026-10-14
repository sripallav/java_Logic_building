import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();

        numdigitssum sd = new numdigitssum();
        System.out.print(sd.numdigitssum(num));



    }
}

class numdigitssum{
    public int numdigitssum(int num){
        int sum = 0;
        while(num>0){
            int digit = num%10;
            sum = sum+digit;
            num = num / 10;
            
        }

        return sum;
    }
}

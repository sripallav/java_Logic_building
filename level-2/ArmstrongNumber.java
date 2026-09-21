//Check if a number is an Armstrong number
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int num = sc.nextInt();

        ArmstrongNumberCheck an = new ArmstrongNumberCheck();
        System.out.println(an.ArmstrongNumberCheck(num));


    }
    
}

class ArmstrongNumberCheck{
    public String ArmstrongNumberCheck(int num){
        int count=0;
        int original = num;
        while(num>0){
            count+=1;
            num = num/10;
        }

        int total = 0;
        num = original;

        while (num>0) { 
            int digit = num%10;
            total = total + (int)Math.pow(digit,count);
            num = num/10;  
        }

        if(original==total){
            return "num is armstrong";
        }

        else{
            return "num is not armstrong";
        }

    }
}

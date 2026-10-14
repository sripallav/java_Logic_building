//Take two integers a and b, and print all numbers between them that are divisible by 7
import java.util.Scanner;
public class NumbersDivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num a: ");
        int a = sc.nextInt();
        System.out.print("enter a num b: ");
        int b = sc.nextInt();

        divisible dv = new divisible();
        dv.divisible(a, b);

    }


    
}

class divisible{
    public void divisible(int a,int b){

        for(int i=a;i<b;i++){
            if(i%7==0){
                System.out.println(i + " ");
            }
        }
        
    }
}

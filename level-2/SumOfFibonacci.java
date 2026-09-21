import java.util.Scanner;
public class SumOfFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a series num: ");
        int num = sc.nextInt();

        sumfibonacii sf = new sumfibonacii();

        System.out.print(sf.sumfibonacii(num));
        
    }
}

class sumfibonacii{
    public int sumfibonacii(int num){
        int sum = 0;
        int a = 0;
        int b = 1;

        for(int i=0;i<num;i++){

            sum = sum + a;

            int c = a+b;
            a = b;
            b = c;

        }

        return sum;
    }
   

        
    }


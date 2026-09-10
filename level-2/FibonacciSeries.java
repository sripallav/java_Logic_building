import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter fibonacii upto: ");
        int num = sc.nextInt();

        fibonacii fb = new fibonacii();
        fb.fibonacii(num);

    }
    
}

class fibonacii{
    public void fibonacii(int num){
        int a = 0;
        int b = 1;

        for(int i=1;i<=num;i++){ 

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;

        
        }
    }
}

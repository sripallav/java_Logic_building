import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num1: ");
        int num1 = sc.nextInt();



        
        Factorialnum fn = new Factorialnum();
        System.out.println(fn.Fact(num1));
        

        
        

        
    }
        
}

class Factorialnum{
    public int Fact(int num1){
        
        int fact = 1;

        for(int i=1;i<=num1;i++){
            fact = fact*i;
    }
    return fact;
}
}
    


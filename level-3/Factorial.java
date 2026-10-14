import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int num = sc.nextInt();

        factorials fc  = new factorials();
        System.out.print(fc.factorials(num));
        
    }
    
}

class factorials{
    public int factorials(int num){
        int fact = 1;
        for(int i=1;i<=num;i++){
            fact = fact*i;   
        }

        return fact;
    }
}

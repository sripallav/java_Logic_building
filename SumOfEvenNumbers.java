import java.util.*;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int n = sc.nextInt();

        EvenNumbers ev = new EvenNumbers();
        System.out.print(ev.EvenNumbers(n));

        
    }
    
}

class EvenNumbers{
    public int EvenNumbers(int n){
        int sum =0;
        for(int i=0;i<=n;i++){
            if(i%2==0){
                sum = sum +i;
            }
        }

        return sum;
    }
}



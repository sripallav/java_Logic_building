import java.util.Scanner;
public class SumOfFactors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  num: ");
        int num = sc.nextInt();


        sumf sf = new sumf();
        System.out.println(sf.sumf(num));

    }
    
}

class sumf{
    public int sumf(int num){
        int sum = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum = sum+i;
            }
        }
        return sum;
    }
}

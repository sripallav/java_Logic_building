import java.util.Scanner;
public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number N: ");
        int N = sc.nextInt();
        oddnumber on = new oddnumber();
        System.out.print(on.oddnumber(N));


        
    }
    
}

class oddnumber{
    public int oddnumber(int N){
        int sum = 0;
        for(int i=1;i<=N;i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        return sum;
    }
}

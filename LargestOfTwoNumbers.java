import java.util.Scanner;
public class LargestOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num1: ");
        int num1 = sc.nextInt();
        System.out.print("enter a num2: ");
        int num2 = sc.nextInt();

        largernumber ln= new largernumber();
        System.out.print(ln.largernum(num1,num2) + " is largest number");



    }
    
}

class largernumber{
    public int largernum(int num1,int num2){
        if(num1>num2){
            return num1;
            
        }
        else{
            return num2;
            
        }


    }
}

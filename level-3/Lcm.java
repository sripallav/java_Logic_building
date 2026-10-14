//Take two integers and find their LCM (Least Common Multiple) using a loop.
import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num a: ");
        int a = sc.nextInt();
        System.out.println("Enter num b: ");
        int b = sc.nextInt();

        lcmcalculator lc = new lcmcalculator();

        System.out.print("Lcm of " + a +" " +  b  + " is " + lc.lcmcalculator(a, b));
      
    }
    
}

class lcmcalculator{
    public int lcmcalculator(int a,int b){
        int clcm = 0;
        int limit = Math.max(a,b);

        for(int i=limit; ;i++){
            if(i%a==0 && i%b==0){
                clcm = i;
                break;
            }
        }
        return clcm;

    }
}



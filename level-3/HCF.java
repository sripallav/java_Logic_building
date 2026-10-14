//Take two integers and find their HCF (Highest Common Factor) / GCD using a loop.
import java.util.Scanner;
public class HCF {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num a: ");
        int a = sc.nextInt();
        System.out.print("enter a num b: ");
        int b = sc.nextInt();


        twonumbershcf hcf = new twonumbershcf();
        System.out.print(hcf.twonumbershcf(a, b));


    }
    
}

class twonumbershcf{
    public int twonumbershcf(int a,int b){
        int hcf = 0;
        int limit = Math.min(a, b);
        for(int i=1;i<=limit;i++){
            if(a%i==0 && b%i==0){
                hcf = i;
            }
        }

        return hcf;


        
    }
}

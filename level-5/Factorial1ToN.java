import java.util.Scanner;
public class Factorial1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int Num = sc.nextInt();

        factorail f = new factorail();
        f.factorail(Num);


    }
  
}

class factorail{
    public void factorail(int Num){
        for(int i=1;i<=Num;i++){
             int fact = 1;
             for(int j=1;j<=i;j++){
                 fact = fact * j;
             }
             System.out.print(fact + " ");
           
        }
    }
}
//Take an integer n and print the square of every number from 1 to n.
import java.util.Scanner;
public class Squares1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();
        square sq = new square();
        sq.square(num);
 
    }

    
}

class square{
    public void square(int num){
        for(int i=1;i<=num;i++){
          int sq = (int)Math.pow(i,2);
          System.out.print(sq+" ");
        }
        
    }
}

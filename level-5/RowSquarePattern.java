import java.util.Scanner;
public class RowSquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int num = sc.nextInt();

            SquarePattern sp = new SquarePattern();
            sp.SquarePattern(num);
        
    }
    
}

class SquarePattern{
    public void SquarePattern(int num){
        for(int i=1;i<=num;i++){
            System.out.print(i*i + " ");
        }


    }
    }


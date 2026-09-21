import java.util.*;
public class SquareStars {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num n: ");
        int num = sc.nextInt();

        pattern2 p2 = new pattern2();
        p2.pattern2(num);
        
    }
}

class pattern2{
    public void pattern2(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                System.out.print("*");

            }
            System.out.println();
            
            
                
                

            }

        }
    }

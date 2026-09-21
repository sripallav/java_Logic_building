import java.util.*;
public class IncreasingTriangle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num n: ");
        int num = sc.nextInt();

        pattern3 p3 = new pattern3();
        p3.pattern3(num);
        
    }
}

class pattern3{
    public void pattern3(int num){
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){

            System.out.print("*");
        }
        System.out.println();

    }
}
}
import java.util.Scanner;

public class ProductOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        products p = new products();
        for(int i=1;i<=3;i++){

        System.out.println("Enter a Number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a Number2: ");
        int num2 = sc.nextInt();

        p.product(num1,num2);
            
        }

    

    }
    
}
class products{
    public void product(int num1,int num2){

        int Product = num1*num2;
        System.out.println("product of two numbers is: " + Product);
    }

}

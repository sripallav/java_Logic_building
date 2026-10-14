import java.util.*;
public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num: ");
        int num = sc.nextInt();

        ProductDigits pd = new ProductDigits();
        System.out.print(pd.ProductDigits(num));





        
    }
    
}

class ProductDigits{
    public int ProductDigits(int num){

        int product = 1;

        while(num>0){
            int digit = num%10;
            product = product*digit;
            num = num/10;

        }

        return product;
    }

}

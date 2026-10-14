import java.util.Scanner;
public class SumOddEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int num = sc.nextInt();

        sumofeando seo = new sumofeando();
        seo.sumofeando(num);


    }
    
}

class sumofeando{
    public void sumofeando(int num){
        int even = 0;
        int odd = 0;

        while(num>0){
            int digit = num%10;
            if(digit%2==0){
                even = even + digit;
            }
            else{
                odd = odd + digit;
            }
            num = num/10;

        }

        System.out.println("sum of even digits: " + even
        );
        System.out.println("sum of odd digits: " + odd
        );


    }
}

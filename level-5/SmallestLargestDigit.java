import java.util.Scanner;
public class SmallestLargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        SmallestandLargestDigit sld = new SmallestandLargestDigit();
        sld.SmallestandLargestDigit(num);

        
    }
    
}

class SmallestandLargestDigit{
    public void SmallestandLargestDigit(int num){
        int smallest = 9;
        int largest = 0;

        while(num>0){
            int digit = num%10;
            if(digit > largest){
                largest = digit;
            }
            if(digit < smallest){
                smallest = digit;
            }
            
            num = num/10;
        }

        System.out.println("samllest: " + smallest);
         System.out.println("largest: " +  largest);


    




    }
}

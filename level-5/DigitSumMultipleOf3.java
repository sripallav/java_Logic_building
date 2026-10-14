//Print all numbers between 1 and 100 whose sum of digits is a multiple of 3.
public class DigitSumMultipleOf3 {
    public static void main(String[] args) {

        multiple3 m3 = new multiple3();
        m3.multiple3();
        
    }

    
}
class multiple3{
    public void  multiple3(){
        for(int i=1;i<=100;i++){
            int num = i;
            int sum = 0;

            while(num>0){
                int digit = num%10;
                sum = sum + digit;
                num = num/10;
            }

            if(sum%3==0){
                System.out.print(i + " ");
            }

            
        }
    }
}

//Print all numbers that are palindromes between 1–500
public class Palindromes1To500 {
    public static void main(String[] args) {

        palindromes p = new palindromes();
        p.palindromes();


        
    }
    
}

class palindromes{
    public void palindromes(){
        for(int i=1;i<=500;i++){
            int num = i;
            int original = i;
            int reverse = 0;

            while(num>0){
                int digit = num%10;
                reverse = reverse*10+digit;
                num = num/10;
            }
            if(reverse == original){
                System.out.print(i + " ");
            }

        }
        
    }
}

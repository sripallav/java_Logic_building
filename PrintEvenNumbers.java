import java.util.Scanner;
public class PrintEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        EvenNumbers en = new EvenNumbers();
        en.EvenNumbers(num);
        
    }

    
}

class EvenNumbers{
    public void EvenNumbers(int num){

        for(int i=1;i<=100;i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }

    }
}

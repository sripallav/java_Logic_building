import java.util.Scanner;
public class PerfectNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = sc.nextInt();

        perfect p = new perfect();
        System.out.print(p.perfect(num));


    }

    
}

class perfect{
    public String perfect(int num){
        int factors = 0;
        int original = num;
        for(int i=1;i<num;i++){
            if(num%i==0){
                factors = factors+i;
            }
        }

        if(original == factors){
            return "perfect number";
        }
        else{
            return "not perfect number";

        }

    }

}

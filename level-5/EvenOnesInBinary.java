import java.util.Scanner;
public class EvenOnesInBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int num = sc.nextInt();

        Binary b = new Binary();
        b.Binary(num);

    }
    
}

class Binary{
    public void Binary(int num){
        for(int i=1;i<=num;i++){
            int num1 = i;
            int binary_count = 0;
            while(num1>0){
                int digit = num1%2;
                if(digit==1){
                    binary_count++;
                }
                num1 = num1 / 2;

            }

            if(binary_count%2==0){
                System.out.print(i + " ");

            }

        }
    }
}

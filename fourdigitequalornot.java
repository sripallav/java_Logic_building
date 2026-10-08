import java.util.*;
    class firstandlastdigit{
    public void firstandlast(int num){

        int digit1 = num%10;
        int digit4 = num/1000;

        if(digit1==digit4){
            System.out.print("First and last digits are equal");
        }
        else{
            System.out.print("first and last digits are not equal");
        }



    }

}

public class fourdigitequalornot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a 4 digit num: ");
        int num = sc.nextInt();

        firstandlastdigit fl = new firstandlastdigit();
        fl.firstandlast(num);

        
        
    }
    
}

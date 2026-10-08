//Count the number of digits in a given number

import java.util.Scanner;
public class CountDigits{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int num = sc.nextInt();

        digitcount dc = new digitcount();
        System.out.print(dc.digitcount(num));


    }
}

class digitcount{
    public int digitcount(int num){

        if(num==0){
            return 1;
        }

        int count = 0;

        while(num>0){
            count+=1;
            num = num/10;
            

        }

        return count;

    }
}


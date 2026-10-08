import java.util.*;
public class DecidingTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the temp: ");
        int temp = sc.nextInt();

        if(temp < 15 ){
            System.out.println("it is cold");
        }
        else if(temp >= 15 && temp< 30){
            System.out.println("it is warm");
        }
        else{
            System.out.println("it is hot");
        }

        sc.close();
        }
    }
    


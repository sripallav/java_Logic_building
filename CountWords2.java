import java.util.Scanner;
public class CountWords2 {
    
  public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String1: ");
        String str = sc.nextLine();

        countwords(str);
        sc.close();

  }

  static void countwords(String str){

    int words = 0;

    for(int i=0;i<str.length();i++){

        if(str.charAt(i)!=' ' && ((i==0) || str.charAt(i-1) == ' ')){

            words++;

        }
       

  }

  System.out.print(words);
}
}
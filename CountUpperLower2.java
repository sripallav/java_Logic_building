import java.util.Scanner;
public class CountUpperLower2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String: ");
        String str = sc.nextLine();


        CountUpperLower2(str);




    }

    static void CountUpperLower2(String str){

        int Upper = 0;
        int Lower = 0;

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch>='A' && ch<='Z'){

                Upper++;

            }
            else if(ch>='a' && ch<='z'){

                Lower++;
            }



        }

        System.out.println("Upper: " + Upper);
        System.out.println("Lower: " + Lower);
    }

    
}


import java.util.Scanner;
public class PrintASCIIValues2 {

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String: ");
        String str = sc.nextLine();

        ASCII(str);
        sc.close();


    
}

static void ASCII(String str){

    
    
    
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);

        int acscii = ch;

        System.out.println(ch + " = " + acscii);
         
    }



   
}
}



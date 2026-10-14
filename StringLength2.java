import java.util.Scanner;
public class StringLength2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a String: ");
        String str = sc.nextLine();

        Stringlen sl = new Stringlen();
        sl.Stringlen(str);



    }
    
}

class Stringlen{
    public void Stringlen(String str){
        System.out.print(str.length());

    }
}

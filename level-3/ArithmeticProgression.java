//9. Print first n terms of an arithmetic progression (a, d).
import java.util.Scanner;
public class ArithmeticProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num a: ");
        int a = sc.nextInt();
        System.out.println("enter a num d: ");
        int d = sc.nextInt();
        System.out.println("enter a num n: ");
        int n = sc.nextInt();

        Arithmetic ap = new Arithmetic();
        ap.Arithmetic(a,d,n);
    }
    
}

class Arithmetic{
    public void Arithmetic(int a,int d,int n){
        int term = a;

        for(int i=1;i<=n;i++){
            System.out.print(term + " ");
            term = term + d;
        }
    }
}

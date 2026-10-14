import java.util.Scanner;
public class GeometricProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num a: ");
        int a = sc.nextInt();
        System.out.println("enter a num r: ");
        int r = sc.nextInt();
        System.out.println("enter a num n: ");
        int n = sc.nextInt();

        Geometric gp = new Geometric();
        gp.Geometric(a,r,n);
    }
    
}

class Geometric{
    public void Geometric(int a,int r,int n){
        int term = a;

        for(int i=1;i<=n;i++){
            System.out.print(term + " ");
            term = term * r;
        }
    }
}

    


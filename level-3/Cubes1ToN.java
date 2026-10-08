import java.util.Scanner;
public class Cubes1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Num: ");
        int num = sc.nextInt();

        cubes cbs = new cubes();
        cbs.cubes(num);

    }
    
}

class cubes{
    public void cubes(int num){
        for(int i=1;i<=num;i++){
            int n = (int)Math.pow(i,3);
            System.out.print(n + " ");

        }
    }
}



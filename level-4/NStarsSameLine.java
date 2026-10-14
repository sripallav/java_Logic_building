import java.util.*;
class NStarsSameLine{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num n: ");
        int num = sc.nextInt();

        pattern1 p1 = new pattern1();
        p1.pattern1(num);
        
    }
}

class pattern1{
    public void pattern1(int num){
        for(int i=1;i<=num;i++){
            System.out.print("*");
        }
    }
}
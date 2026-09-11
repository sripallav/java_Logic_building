import java.util.*;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        factorsofnum ffn = new factorsofnum();
        ffn.factorsofnum(num);





    }
    
}

class factorsofnum{
    public void factorsofnum(int num){
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i + " ");
            }
            

           

    }
    }
}

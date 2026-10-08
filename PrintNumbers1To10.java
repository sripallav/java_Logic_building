public class PrintNumbers1To10{
public static void main(String[] args) {

    Numbers n = new Numbers();
    n.Numbers(10);

    
}
}

class Numbers{
    public void Numbers(int num){

        for(int i=1;i<=num;i++){
            System.out.println(i);
        }

    }
}
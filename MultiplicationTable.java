public class MultiplicationTable {
    public static void main(String[] args) {
        Multiplication ml = new Multiplication();
        ml.Multiplication(5);
        
    }
    
}

class Multiplication{
    public void Multiplication(int num){
        for(int i=1;i<=10;i++){
            System.out.println(num + " X " + i + " = " + num*i );
        }
    }
}

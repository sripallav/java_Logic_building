
public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        NaturalNumbers Nn = new NaturalNumbers();
        System.out.print(Nn.numbers(10));
        
    }
    
}

class NaturalNumbers{
    public int numbers(int num){
        int sum=0;
        for(int i=1;i<=num;i++){
            sum =sum+i;
        }
        return sum;


    }
}
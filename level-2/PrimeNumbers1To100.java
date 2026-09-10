public class PrimeNumbers1To100 {
    public static void main(String[] args) {
        
        prime p = new prime();
        p.prime(100);
    }
    
}

class prime{
    public void prime(int num){
        for(int i=1;i<=num;i++){
            int count = 0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
        }
        

        }
    }
}

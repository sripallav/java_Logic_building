//Count how many numbers between 1 and 500 are divisible by 7 but not by 5.
public class CountDivisibleBy7Not5 {
    public static void main(String[] args) {

        divisible db = new divisible();
        db.divisible();
        
    }
    
}

class divisible{
    public void divisible(){
        int count = 0;
        for(int i=1;i<=500;i++){
            if(i%7==0 && i%5!=0){
                count++;
            }

        }
        System.out.print(count);
    }
}

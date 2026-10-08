public class PrintOddNumbers {
    public static void main(String[] args) {

        oddnumbers on = new oddnumbers();
        on.oddnumbers(100);

    }
    
}

class oddnumbers{
    public void oddnumbers(int num){

        
        for(int i=1;i<=num;i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }

    }
}

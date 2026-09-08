public class PrintNumbers10To1 {
    public static void main(String[] args) {
        Numbers10to1 nm = new Numbers10to1();
        nm.Number10to1(1);

        
        
    }
    
}
class Numbers10to1{
    public void Number10to1(int num){
        for(int i=10;i>=num;i--){
            System.out.print(i + " ");
        }
    }
}
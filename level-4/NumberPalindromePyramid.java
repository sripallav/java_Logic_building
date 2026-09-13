public class NumberPalindromePyramid {
    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++) {

            // Increasing part
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Decreasing part
            for(int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}
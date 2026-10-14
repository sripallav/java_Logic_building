public class DiamondStars {
    public static void main(String[] args) {

        // Top half
        for(int i = 1; i <= 5; i++) {

            for(int k = 4; k >= i; k--) {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Bottom half
        for(int i = 4; i >= 1; i--) {

            for(int k = 4; k >= i; k--) {
                System.out.print(" ");
            }

            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
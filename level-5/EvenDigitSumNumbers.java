// Print all numbers whose sum of digits is even between 1 and 100.

class EvenDigitSumNumbers {
    public static void main(String[] args) {

        evendigits ed = new evendigits();
        ed.evendigits();
    }
}

class evendigits {

    public void evendigits() {

        for(int i = 1; i <= 100; i++) {

            int sum = 0;
            int num = i;

            while(num > 0) {
                int digit = num % 10;
                sum = sum + digit;
                num = num / 10;
            }

            if(sum % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
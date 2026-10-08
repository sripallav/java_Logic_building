import java.util.Arrays;

public class passingFunction {
    public static void main(String args[]) {

        int[] arr = {2454, 5656, 65323, 646, 46};

        System.out.print(Arrays.toString(arr));

        passing ps = new passing();

        ps.change(arr);

        System.out.print(Arrays.toString(arr));
    }

}

class passing{


    public void change(int[] arr) {
        arr[3] = 58;
    }
}
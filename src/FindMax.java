import java.util.Arrays;
import java.util.Random;

public class FindMax {

    public static void main(String[] args) {
        int[] arr = new int[20];
        randomFill(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(findMax(arr));
    }

    private static void randomFill(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
    }
    private static int findMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}

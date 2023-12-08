import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[20];
        arrFill(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr, 34));
    }

    private static int[] arrFill(int[] arr) {

        Random r = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
        Arrays.sort(arr);

        return arr;
    }

    private static int binarySearch(int[] arr, int number) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = arr[middlePosition];

            if (number == middleNumber) {
                return middlePosition;
            }
            if (number < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }

        return -1;
    }
}

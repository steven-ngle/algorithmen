import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[20];
        randomFill(arr);
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void randomFill(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                // Finde minimum in unsortiertem Teil
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int x = arr[i];
            arr[i] = arr[min];
            arr[min] = x;
        }
    }
}

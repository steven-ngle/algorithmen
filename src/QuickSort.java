import java.util.Arrays;

/**
 * @author : Steven
 * @created : 10.01.2024, Mittwoch
 **/

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {-2, -9, 42, 21, 66, 7, 8, 1, 0, 2};
        System.out.println(Arrays.toString(arr));
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    private static int partition(int[] arr, int l, int h) {
        int pivot = arr[h];
        int i = l - 1;
        for (int j = l; j < h; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        return i + 1;
    }

    private static void quicksort(int[] arr, int l, int h) {
        if (h > l) {
            int p = partition(arr, l, h);
            quicksort(arr, l, p - 1);
            quicksort(arr, p + 1, h);
        }
    }
}

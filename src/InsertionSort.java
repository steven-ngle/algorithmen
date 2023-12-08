import java.util.Arrays;
import java.util.Random;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[20];
        randomFill(arr);
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void randomFill(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }
    }

    private static void insertionSort(int[] arr) {
        // arr ist array der Länge n
        for (int j = 1; j < arr.length; j++) {
            int key = arr[j]; //arr[j] in arr[1...j-1] einfuegen
            int i = j - 1;

            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i--;
                arr[i + 1] = key;
            }
        }
    }
}

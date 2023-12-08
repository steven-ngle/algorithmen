import java.util.Arrays;
import java.util.Random;

public class MergeSort {

    // merge sort = teile rekursiv in zwei Hälften, sortiere diese und füge sie wieder zusammen
    // run-time complexity: O(n log n)
    // space complexity: O(n)

    public static void main(String[] args) {
        int[] arr = new int[20];
        randomFill(arr);
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {

        int length = arr.length;

        //base case
        if (length < 2) {
            return;
        }

        int middle = length / 2;
        int[] leftArr = new int[middle];
        int[] rightArr = new int[length - middle];

        int i = 0; //left array
        int j = 0; //right array

        for (; i < length; i++) {
            if (i < middle) {
                leftArr[i] = arr[i];
            } else {
                rightArr[j] = arr[i];
                j++;
            }
        }
        mergeSort(leftArr);
        mergeSort(rightArr);
        merge(leftArr, rightArr, arr);
    }

    private static void merge(int[] leftArr, int[] rightArr, int[] arr) {

        int leftSize = arr.length / 2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0; //indices

        //check the conditions for merging
        while (l < leftSize && r < rightSize) {
            if (leftArr[l] < rightArr[r]) {
                arr[i] = leftArr[l];
                i++;
                l++;
            } else {
                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }

        while (l < leftSize) {
            arr[i] = leftArr[l];
            i++;
            l++;
        }

        while (r < rightSize) {
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }

    private static int[] randomFill(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100);
        }

        return arr;
    }
}
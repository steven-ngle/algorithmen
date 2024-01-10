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

    // Hilfsmethode zur Partitionierung des Arrays
    private static int partition(int[] arr, int l, int h) {
        // Auswahl des Pivotelements, hier das letzte Element des Arrays
        int pivot = arr[h];
        // Initialisierung des Indexes für kleinere Elemente
        int i = l - 1;
        // Durchlaufen des Arrays
        for (int j = l; j < h; j++) {
            // Wenn das aktuelle Element kleiner oder gleich dem Pivotelement ist
            if (arr[j] <= pivot) {
                // Erhöhung des Indexes der kleineren Elemente
                i++;
                // Tauschen von arr[i] und arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Tauschen von arr[i+1] und arr[h] (oder Pivotelement)
        int temp = arr[i + 1];
        arr[i + 1] = arr[h];
        arr[h] = temp;
        // Rückgabe des Indexes für das nächste Pivotelement
        return i + 1;
    }

    // Methode zur Implementierung von QuickSort
    private static void quicksort(int[] arr, int l, int h) {
        // Überprüfung, ob das untere Ende kleiner als das obere Ende ist
        if (h > l) {
            // Partitionierung des Arrays
            int p = partition(arr, l, h);
            // Rekursiver Aufruf von QuickSort für die linke Hälfte
            quicksort(arr, l, p - 1);
            // Rekursiver Aufruf von QuickSort für die rechte Hälfte
            quicksort(arr, p + 1, h);
        }
    }
}

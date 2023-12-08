import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class BogoSort {

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        randomFill(arrList);
        System.out.println(arrList);
        bogoSort(arrList);
        System.out.println(arrList);
    }

    public static void randomFill(ArrayList arrList) {

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            arrList.add(r.nextInt(100));
        }
    }

    public static void bogoSort(ArrayList arrList) {
        // schnellster Algorithmus
        ArrayList<Integer>arrList2 = new ArrayList<Integer>(arrList);
        arrList2.sort(Comparator.naturalOrder());

        while (arrList.equals(arrList2) != true) {
            // O((n+1)!)
            Collections.shuffle(arrList);
        }
    }
}

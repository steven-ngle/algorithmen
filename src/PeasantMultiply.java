public class PeasantMultiply {

    public static void main(String[] args) {
        System.out.println(peasantMultiply(7, 9));
    }

    private static int peasantMultiply(int x, int y) {

        int prod = 0;
        while (x > 0) {
            if (x % 2 == 1) {
                prod += y;
            }

            x = Math.floorDiv(x, 2);
            y += y;
        }

        return prod;
    }
}

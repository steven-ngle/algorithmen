public class PeasantMultiply {

    public static void main(String[] args) {
        System.out.println(peasantMultiply(7, 9));
        System.out.println(peasantMultiplyRecursive(7, 9));
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

    private static int peasantMultiplyRecursive(int x, int y) {
        if (x == 0) {
            return 0;
        } else {
            int x_hat = x / 2;
            int y_hat = y + y;
            int prod = peasantMultiplyRecursive(x_hat, y_hat);
            if (x % 2 != 0) {
                prod = prod + y;
            }
            return prod;
        }
    }
}

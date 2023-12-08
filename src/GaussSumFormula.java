public class GaussSumFormula {

    public static void main(String[] args) {
        System.out.println(sum(3));
    }

    private static int sum(int n) {
        n = (n*(n+1))/2;

        return n;
    }
}

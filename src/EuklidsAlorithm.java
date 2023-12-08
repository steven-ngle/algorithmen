public class EuklidsAlorithm {

    public static void main(String[] args) {
        System.out.println(ggT(60, 24));
    }

    private static int ggT(int m, int n) {

        int r = 0;

        /** Solange n ungleich 0 ist, wird m durch n geteilt und der Rest in r gemerkt.
         Der Wert von n wird m zugewiesen und r wird n zugewiesen. **/
        while (n != 0) {
            r = m % n;
            m = n;
            n = r;
        }
        return m;
    }
}

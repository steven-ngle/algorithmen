public class TowerOfHanoi {
    
    public static void main(String[] args) {
        hanoi(3, 'A', 'C', 'B');
    }

    private static void hanoi(int n, char src, char dst, char tmp) {
        if (n > 0) {
            hanoi(n - 1, src, tmp, dst);
            System.out.println("Moving disk " + n + " from " + src + " to " + dst);
            hanoi(n - 1, tmp, dst, src);
        } else {
            return;
        }
    }
}

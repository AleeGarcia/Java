

public class CountMonkey {
    public static int[] countmonkey(final int n) {
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = i + 1;
        }
        return num;
    }
}